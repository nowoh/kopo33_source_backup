use kopo33;

#정답 테이블 만들기
drop table if exists answer;
create table answer(
	subjectID int not null, 
	a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
	a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
	primary key(subjectID));


#학생 답안 테이블 만들기
drop table if exists Testing;
create table Testing(
	subjectID int not null,
    stu_name varchar(20), stu_id int not null,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
	a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
	primary key(subjectID, stu_id));


#학생 채점 결과 테이블 만들기
drop table if exists Scoring;
create table Scoring(
	subjectID int not null,
    stu_name varchar(20), stu_id int not null,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
	a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
    score int, primary key(subjectID, stu_id));


#점수 결과 테이블 만들기
drop table if exists Reporttable;
create table Reporttable(
	stu_name varchar(20), stu_id int not null primary key,
    kor int, eng int, mat int);
    
desc answer;
desc Testing;
desc Scoring;
desc Reporttable;


#answer 테이블에 정답 넣기
delete from answer where subjectID > 0;
drop procedure if exists insert_answer;
delimiter $$
create procedure insert_answer(_limit integer)
begin
declare _cnt integer;
set _cnt = 0;
	_loop: LOOP
		set _cnt = _cnt+1;
		insert into answer value (_cnt, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1
			, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1
			, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1
            , rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1);
		if _cnt = _limit then
			leave _loop;
		end if;
	end loop _loop;
end $$
delimiter ;

call insert_answer(3);
select * from answer;

create table Testing(
	subjectID int not null,
    stu_name varchar(20), stu_id int not null,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
	a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
	primary key(subjectID, stu_id));


#Testing
delete from Testing where subjectID > 0;
drop procedure if exists insert_Testing;
delimiter $$
create procedure insert_Testing(_limit integer)
begin
	declare _name varchar(20);
    declare _id integer;
    declare _cnt integer;
    set _cnt = 0;
	_loop: LOOP
		set _cnt = _cnt+1;
		set _name = concat("홍길", cast(_cnt as char(4))) ;
		set _id = 209900 + _cnt;
		
		insert into examtable4 value (_name, _id, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1
			, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1
			, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1
            , rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1, rand()*3+1);
		
		if _cnt = _limit then
			leave _loop;
		end if;
	end LOOP _loop;
end $$

call insert_examtable4(1000);
select * from examtable4;