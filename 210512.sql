use kopo33;
drop table if exists examtable2;
create table examtable2(
name varchar(20),
id int not null primary key,
kor int, eng int, mat int);
desc examtable2;


delete from examtable2 where id>0;
INSERT INTO examtable2 VALUE ("나연", 209901, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("정연", 209902, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("모모", 209903, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("사나", 209904, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("지효", 209905, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("미나", 209906, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("다현", 209907, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("채영", 209908, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("쯔위", 209909, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("송가인", 209910, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("나연", 209911, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("정연", 209912, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("모모", 209913, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("사나", 209914, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("지효", 209915, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("미나", 209916, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("다현", 209917, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("채영", 209918, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("쯔위", 209919, rand()*100, rand()*100, rand()*100);
INSERT INTO examtable2 VALUE ("송가인", 209920, rand()*100, rand()*100, rand()*100);

select * from examtable2;
select * from examtable2 order by kor;
select * from examtable2 order by eng;
select * from examtable2 order by kor, eng;
select * from examtable2 order by kor asc;
select * from examtable2 order by kor desc;

select * from examtable2 order by name desc;
select * from examtable2 order by mat desc;
select *, kor+eng+mat as sum, (kor+eng+mat)/3 as avg 
	from examtable2 order by kor+eng+mat desc;

select *, kor+eng+mat, (kor+eng+mat)/3 from examtable2;
select *, kor+eng+mat, (kor+eng+mat)/3 from examtable2 order by kor+eng+mat desc;
select *, kor+eng+mat as total, (kor+eng+mat)/3 as average from examtable2 order by total desc;

select name as 이름, id as 학번, kor as 국어, eng as 영어, mat as 수학, kor+eng+mat as 합계, 
(kor+eng+mat)/3 as 평균 from examtable2 order by 합계 desc;

select * from examtable2 group by name;
select name, count(name) from examtable2 group by name;
select * from examtable2 group by kor;
select kor, count(kor) from examtable2 group by kor;
select kor, count(kor) from examtable2 group by eng;
select kor, count(kor), eng, count(eng) from examtable2 group by kor, eng;
select eng, count(eng) from examtable2 group by eng;
select eng, count(eng), (count(eng)/(select count(*) from examtable2))*100 as 비율 from examtable2 group by eng;   #전체에서 같은 점수끼리 묶인 것들이 각각 차지하는 비율 계산

INSERT INTO examtable2 VALUE ("팽수", 209921, 100, 90, rand()*100);
INSERT INTO examtable2 VALUE ("팽수", 209922, 100, 90, rand()*100);
select kor, count(kor), eng, count(eng) from examtable2 group by kor, eng;
select name, count(name), kor, count(kor), eng, count(eng) from examtable2 group by name, kor, eng;
select *, name, count(name), kor, count(kor), eng, count(eng) from examtable2 group by name, kor, eng;

select eng, count(eng) from examtable2 group by eng having count(eng)>1;

DROP PROCEDURE IF EXISTS get_sum;
DELIMITER $$
create procedure get_sum(
	in _id integer,
    out _name varchar(20),
    out _sum integer
)
BEGIN
	declare _kor integer;
    declare _eng integer;
    declare _mat integer;
    #declare _sum integer;
    set _kor = 0;
   
    select name, kor, eng, mat
		into _name, _kor, _eng, _mat from examtable2 where id = _id;
        
    set _sum = _kor+_eng+_mat;
END $$
DELIMITER ;

call get_sum(209901,@name,@sum);
select * from examtable2;
select @name,@sum;
    
drop function if exists f_get_sum;
DELIMITER $$
create function f_get_sum(_id integer) returns integer
BEGIN
	declare _sum integer;
    select kor+eng+mat into _sum from examtable2 where id = _id;
return _sum;
END $$
DELIMITER ;

select *, f_get_sum(id) from examtable2 ;

show global variables like 'log_bin_trust_function_creators';
SET Global log_bin_trust_function_creators = 'ON';

drop procedure if exists insert_examtable2;
delimiter $$
create procedure insert_examtable2(_last integer)
begin
declare _name varchar(20);
declare _id integer;
declare _cnt integer;

set _cnt = 0;
delete from examtable2 where id > 0;
	_loop: LOOP
		set _cnt = _cnt+1;
        set _name = concat("홍길", cast(_cnt as char(4)));
        set _id = 209900 + _cnt;
        
        insert into examtable2 value (_name, _id, rand()*100, rand()*100, rand()*100);
        
        if _cnt = _last then
			leave _loop;
		end if;
	end LOOP _loop;
end $$

call insert_examtable2(1000);
select * from examtable2;
select *,kor+eng+mat as sum, (kor+eng+mat)/3 as ave from examtable2 limit 30, 19;

drop table if exists examtable3;
create table examtable3(
name varchar(20),
id int not null primary key,
kor int, eng int, mat int, sum int, avg int);
desc examtable3;

drop procedure if exists insert_examtable3;
delimiter $$
create procedure insert_examtable3(_last integer)
begin
declare _name varchar(20);
declare _id integer; 
declare _cnt integer;
declare _kor integer;
declare _eng integer;
declare _mat integer;
declare _sum integer;
declare _avg integer;

set _cnt = 0;
delete from examtable3 where id > 0;
	_loop: LOOP
		set _cnt = _cnt+1;
        set _name = concat("홍길", cast(_cnt as char(4)));
        set _id = 209900 + _cnt;
        set _kor = rand()*100;
        set _eng = rand()*100;
        set _mat = rand()*100;
        set _sum = _kor + _eng + _mat;
        set _avg = _sum/3;
        
        insert into examtable3 value (_name, _id, _kor, _eng, _mat, _sum, _avg);
        
        if _cnt = _last then
			leave _loop;
		end if;
	end LOOP _loop;
end $$

call insert_examtable3(1000);
select * from examtable3;


drop function if exists f_get_rank;
DELIMITER $$
create function f_get_rank(_id integer) returns integer
begin
	declare _rank integer;
    select (select count(*) from examtable3 where sum > (select sum from examtable3 where id = _id))+1
    into _rank from examtable3 where id = _id;
return _rank;
end $$
DELIMITER ;

select *, f_get_rank(id) as ranking from examtable3 order by sum desc;
