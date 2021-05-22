use kopo33;
#drop table if exists tupyo;
create table tupyo(
name varchar(20),
age int);

delete from tupyo where id>0;
INSERT INTO tupyo VALUE ("나연", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("정연", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("모모", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("사나", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("지효", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("미나", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("다현", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("채영", (floor(rand()*9)+1)*10);
INSERT INTO tupyo VALUE ("쯔위", (floor(rand()*9)+1)*10);

select name as 이름, count(name) as 득표수, (count(name)/(select count(*) from tupyo))*100 as 득표율 
	from tupyo group by name order by 득표율 desc;
#select concat(age, "대") as 연령대, count(age) as 득표수, (count(age)/(select count(*) from tupyo))*100 as 득표율 from tupyo group by age order by age asc;

select concat(age, "대") as 연령대, count(age) as 득표수, (count(age)/(select count(*) from tupyo where name = "나연"))*100 as 득표율 
	from tupyo group by name, age having name = "나연" order by age asc;
select concat(age, "대") as 연령대, count(age) as 득표수, (count(age)/(select count(*) from tupyo where name = "정연"))*100 as 득표율 
	from tupyo group by name, age having name = "정연" order by age asc;

select count(*) from tupyo;

#twice table 생성
drop table if exists twice;
create table twice(
name varchar(20),
age int);

#트와이스 멤버 선호도 입력 procedure
drop procedure if exists insert_twice;
delimiter $$
create procedure insert_twice(_last integer)
begin
declare _name varchar(20);
declare _age integer;
declare _rnd integer;
declare _cnt integer;

set _cnt = 0;
	_loop: LOOP
		set _cnt = _cnt+1;
        set _rnd = floor(rand()*9)+1;
        set _age = (floor(rand()*9)+1)*10;
        
        if _rnd = 1 then set _name = '나연'; end if;
        if _rnd = 2 then set _name = '정연'; end if;
        if _rnd = 3 then set _name = '모모'; end if;
        if _rnd = 4 then set _name = '사나'; end if;
        if _rnd = 5 then set _name = '지효'; end if;
        if _rnd = 6 then set _name = '미나'; end if;
        if _rnd = 7 then set _name = '다현'; end if;
        if _rnd = 8 then set _name = '채영'; end if;
        if _rnd = 9 then set _name = '쯔위'; end if;
        
        insert into twice value (_name, _age);
        
        if _cnt = _last then
			leave _loop;
		end if;
	end LOOP _loop;
end $$
DELIMITER ;


call insert_twice(1000);
select * from twice;

#선호도 비율 이름 기준 함수
drop function if exists twice_prefer_name;
DELIMITER $$
create function twice_prefer_name(_name varchar(20)) returns float
begin
	declare _prefer float;
    select (count(*)/(select count(*) from twice))*100
    into _prefer from twice where name = _name;
return _prefer;
end $$
DELIMITER ;

#선호도 비율 연령대 기준함수
drop function if exists twice_prefer_age;
DELIMITER $$
create function twice_prefer_age(_age integer) returns float
begin
	declare _prefer float;
    select (count(*)/(select count(*) from twice))*100
    into _prefer from twice where age = _age;
return _prefer;
end $$
DELIMITER ;

#선호도 비율 이름 기준 출력
select name as 이름, twice_prefer_name(name) as 선호도비율 from twice group by name;
#선호도 비율 연령대 기준 출력
select concat(age, '대') as 연령대, twice_prefer_age(age) as 선호도비율 from twice group by age order by age asc;








