#데이터 입력
call insert_scores(1000);
#데이터 들어가졌는지 확인
select * from scores;

#원하는 페이지 출력
call print_report(5, 25);
#현재 페이지 통계 출력
call print_current_report(5,25);
#누적 페이지 통계 출력
call print_acc_report(5,25);



#데이터 table 생성
drop table if exists scores;
create table scores(
id int not null primary key,
name varchar(20), 
kor int, eng int, mat int, sum int, avg float);

#데이터 입력 procedure
drop procedure if exists insert_scores;
delimiter $$
create procedure insert_scores(_last integer)
begin
declare _id integer;
declare _name varchar(20);
declare _cnt integer;
declare _kor integer;
declare _eng integer;
declare _mat integer;
declare _sum integer;
declare _avg float;

set _cnt = 0;
delete from scores where id > 0;
	_loop: LOOP
		set _cnt = _cnt+1;
        set _name = concat("홍길", cast(_cnt as char(4)));
        set _id = _cnt;
        set _kor = rand()*100;
        set _eng = rand()*100;
        set _mat = rand()*100;
        set _sum = _kor + _eng + _mat;
        set _avg = _sum/3.0;
        
        insert into scores value (_id, _name, _kor, _eng, _mat, _sum, _avg);
        
        if _cnt = _last then
			leave _loop;
		end if;
	end LOOP _loop;
end $$



#원하는 페이지 출력 procedure
DROP PROCEDURE IF EXISTS print_report;
DELIMITER $$
create procedure print_report(
	_page integer,
    _limit integer)
BEGIN
	if _page < 1 then
		set _page = 1; end if;
	if _page > ((select count(*) from scores)/ _limit) then
		set _page = ((select count(*) from scores)/_limit)+1; end if;
        
	select id as 번호, name as 이름, kor as 국어, eng as 영어, mat as 수학, sum as 총점, avg as 평균, scores_rank(id) as 등수 
		from scores where id > (_page-1)*_limit and id <= (_page*_limit) order by sum desc;
END $$
DELIMITER ;



#현재 페이지 통계 출력 procedure
drop procedure if exists print_current_report;
DELIMITER $$
create procedure print_current_report(
	_page integer,
    _limit integer)
BEGIN
	if _page < 1 then
		set _page = 1; end if;
	if _page > ((select count(*) from scores)/ _limit) then
		set _page = ((select count(*) from scores)/_limit)+1; end if;
        
	drop table if exists current_result;
    create table current_result (name varchar(20), kor int, eng int, mat int, sum int, avg float);
    
    insert into current_result select '합계', sum(kor), sum(eng), sum(mat), sum(sum), sum(avg) from scores
    where id > (_page-1)*_limit and id <= (_page*_limit);
    
    insert into current_result select '평균', avg(kor), avg(eng), avg(mat), avg(sum), avg(avg) from scores
		where id > (_page-1)*_limit and id <= (_page*_limit);
    
    select * from current_result;
END $$
DELIMITER ;



#누적 페이지 통계 출력 procedure
drop procedure if exists print_acc_report;
DELIMITER $$
create procedure print_acc_report(
	_page integer,
    _limit integer)
BEGIN
	if _page < 1 then
		set _page = 1; end if;
	if _page > ((select count(*) from scores)/ _limit) then
		set _page = ((select count(*) from scores)/_limit)+1; end if;
        
	drop table if exists acc_result;
    create table acc_result (name varchar(20), kor int, eng int, mat int, sum int, avg float);
    
    insert into acc_result select '합계', sum(kor), sum(eng), sum(mat), sum(sum), sum(avg) from scores
		where id > 0 and id <= (_page*_limit);
    
    insert into acc_result select '평균', sum(kor) / (_page*_limit), sum(eng) / (_page*_limit), 
		sum(mat) / (_page*_limit), sum(sum) / (_page*_limit), sum(avg) / (_page*_limit) from scores
		where id > 0 and id <= (_page*_limit);
    
    select * from acc_result;
END $$
DELIMITER ;



#등수 함수
drop function if exists scores_rank;
DELIMITER $$
create function scores_rank(_id integer) returns integer
begin
	declare _rank integer;
    select (select count(*) from scores where sum > (select sum from scores where id = _id))+1
    into _rank from scores where id = _id;
return _rank;
end $$
DELIMITER ;

select *, f_get_rank(id) as ranking from scores order by sum desc;






