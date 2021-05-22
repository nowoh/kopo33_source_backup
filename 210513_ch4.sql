use kopo33;
drop table if exists hubo;
create table hubo(
	kiho int not null, 
	name varchar(50), 
	gongyak varchar(200),
	primary key(kiho),
	index(kiho)); #목차를 잡아놔야 빨리 찾을 수 있다.
desc hubo;

drop table if exists tupyo;
create table tupyo(
	kiho int,
    age int,
    foreign key(kiho) references hubo(kiho));
desc tupyo;

delete from hubo where kiho > 0;
insert into hubo values (1, "나연", "정의사회 구현");
insert into hubo values (2, "정연", "모두 1억 줌");
insert into hubo values (3, "모모", "월화수목토토일");
insert into hubo values (4, "사나", "살맛나는 세상, 비계맛도 조금");
insert into hubo values (5, "지효", "먹다 지쳐 잠드는 세상");
insert into hubo values (6, "미나", "나 뽑으면 너하고 싶은거 다해");
insert into hubo values (7, "다현", "장바구니 다 사줄게");
insert into hubo values (8, "채영", "노는게 젤조은 뽀로로세상 구현");
insert into hubo values (9, "쯔위", "커플지옥 싱글 파라다이스");

select kiho as 기호, name as 성명, gongyak as 공약 from hubo;

delete from tupyo where kiho > 0;
drop procedure if exists insert_tupyo;
delimiter $$
create procedure insert_tupyo(_limit integer)
begin
declare _cnt integer;
set _cnt = 0;
	_loop: LOOP
		set _cnt = _cnt+1;
		insert into tupyo value (rand()*8+1, rand()*8+1);
		if _cnt = _limit then
			leave _loop;
		end if;
	end loop _loop;
end $$
delimiter ;

#select * from tupyo; #값이 들어갔는지 확인
call insert_tupyo(1000);

select kiho as 기호, name as 성명, gongyak as 공약 from hubo;
select kiho as 투표한기호, age as 투표자연령대 from tupyo;

#아래 세 개는 결국 같은 값을 가져오는 것
select kiho, count(*) from tupyo group by kiho;
select b.name, b.gongyak, count(a.kiho)
	from tupyo as a, hubo as b
	where a.kiho = b.kiho
    group by a.kiho;
select
	(select name from hubo where kiho = a.kiho),
    (select gongyak from hubo where kiho = a.kiho),
    count(a.kiho)
    from tupyo as a
    group by a.kiho;
    


#한 사람당 세 명씩 뽑는 경우
drop table if exists tupyo2;
create table tupyo2(
	kiho1 int,
	kiho2 int,
	kiho3 int,
	age int,
    foreign key(kiho1) references hubo(kiho),
	foreign key(kiho2) references hubo(kiho),
    foreign key(kiho3) references hubo(kiho));
desc tupyo2;



#insert 프로시져
delete from tupyo2 where age > 0;
drop procedure if exists insert_tupyo2;
delimiter $$
create procedure insert_tupyo2(_limit integer)
begin
declare _cnt integer;
set _cnt = 0;
	_loop: LOOP
		set _cnt = _cnt+1;
		insert into tupyo2 value (rand()*8+1, rand()*8+1, rand()*8+1, rand()*8+1);
		if _cnt = _limit then
			leave _loop;
		end if;
	end loop _loop;
end $$
delimiter ;

call insert_tupyo2(1000);
select * from tupyo2;

select a.age, h1.name, h2.name, h3.name
	from tupyo2 as a, hubo as h1, hubo as h2, hubo as h3
	where a.kiho1 = h1.kiho and a.kiho2 = h2.kiho and a.kiho3 = h3.kiho ;
    
select
	(select age from hubo where a.kiho1 = kiho)as "age",
    (select name from hubo where a.kiho1 = kiho) as "투표1",
    (select name from hubo where a.kiho2 = kiho) as "투표2",
	(select name from hubo where a.kiho3 = kiho) as "투표3"
    from tupyo2 as a;
    
select
	(select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1) as "나연",
    (select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2) as "정연",
    (select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 3 or kiho3 = 3) as "모모",
    (select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 4 or kiho3 = 4) as "사나",
    (select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 5 or kiho3 = 5) as "지효",
    (select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 6 or kiho3 = 6) as "미나",
    (select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 7 or kiho3 = 7) as "다현",
    (select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 8 or kiho3 = 8) as "채영",
    (select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 9 or kiho3 = 9) as "쯔위",
    ((select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1)+
		(select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2)+
		(select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 3 or kiho3 = 3)+
        (select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 4 or kiho3 = 4)+
        (select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 5 or kiho3 = 5)+
        (select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 6 or kiho3 = 6)+
		(select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 7 or kiho3 = 7)+
		(select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 8 or kiho3 = 8)+
		(select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 9 or kiho3 = 9)) as "총합",
    (select count(*) from tupyo2 where kiho1 = kiho2 or kiho1 = kiho3 or kiho2 = kiho3) as "2중복",
    (select count(*) from tupyo2 where kiho1 = kiho2 and kiho2 = kiho3) as "3중복";
 
 
 
#성적 테이블 생성
drop table if exists examtable4;
create table examtable4(
	name varchar(20),
    id int not null primary key,
    kor int, eng int, mat int);
desc examtable4;

#성적 테이블 입력 프로시져 생성
delete from examtable4 where id > 0;
drop procedure if exists insert_examtable4;
delimiter $$
create procedure insert_examtable4(_limit integer)
begin
	declare _name varchar(20);
    declare _id integer;
    declare _cnt integer;
    set _cnt = 0;
	_loop: LOOP
		set _cnt = _cnt+1;
		set _name = concat("홍길", cast(_cnt as char(4))) ;
		set _id = 209900 + _cnt;
		
		insert into examtable4 value (_name, _id, rand()*100, rand()*100, rand()*100);
		
		if _cnt = _limit then
			leave _loop;
		end if;
	end LOOP _loop;
end $$

call insert_examtable4(1000);
select * from examtable4;


#view 생성
drop view if exists examview;
create view examview(name, id, kor, eng, mat, tot, avg, ran)
as select *, #이름,학번, 국어, 영어, 수학
	b.kor + b.eng + b.mat,	#총점
    (b.kor + b.eng + b.mat)/3,	#평균
    ( select count(*)+1 from examtable4 as a
		where (a.kor + a.eng + a.mat) > (b.kor + b.eng + b.mat) )	#등수
	from examtable4 as b;
    
select * from examview;
select name, ran from examview;

select * from examview where ran > 5;
insert into examview values ("나연", 309933, 100, 100, 100, 300, 100, 1);

drop table if exists examtableEX;
create table examtableEX(freewifi
	name varchar(20),
    id int not null primary key,
    kor int, eng int, mat int, sum int, avg double, ranking int);
desc examtableEX;

insert into examtableEX
	select *, b.kor+b.eng+b.mat, (b.kor+b.eng+b.mat)/3,
    (select count(*)+1 from examtable4 as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat))
    from examtable4 as b;
    
select * from examtableEX order by ranking desc;
    
select (1=1) from examtableEX;    
select (1=2) from examtableEX;
    
select exists( select kor from examtableEX where kor > 101);    
    