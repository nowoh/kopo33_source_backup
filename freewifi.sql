#원하는 페이지 출력
call print_report_wifi(5, 25);
#원하는 페이지만 dis_cal_wifi 테이블에 넣는 procedure
call insert_distance(5, 25);
#원하는 페이지 set된 dis_cal_wifi select
select * from dis_cal_wifi;



#원하는 페이지 출력 procedure
DROP PROCEDURE IF EXISTS print_report_wifi;
DELIMITER $$
create procedure print_report_wifi(
	_page integer,
    _limit integer)
BEGIN
	if _page < 1 then
		set _page = 1; end if;
	if _page > ((select count(*) from freewifi)/ _limit) then
		set _page = ((select count(*) from freewifi)/_limit)+1; end if;
        
	select wifi_number as 번호, place_addr_land as 주소,  latitude as 위도, longitude as 경도 
		from freewifi where wifi_number > (_page-1)*_limit and wifi_number <= (_page*_limit);
END $$
DELIMITER ;



#거리까지 들어가 있는 테이블
drop table if exists dis_cal_wifi;
create table dis_cal_wifi (wifi_number int not null primary key, place_addr_land varchar(200), 
	latitude double, longitude double, distance double);
desc dis_cal_wifi;



#dis_cal_wifi에 data insert하는 procedure
DROP PROCEDURE IF EXISTS insert_distance;
DELIMITER $$
create procedure insert_distance(_page integer, _limit integer)
BEGIN
declare _wifi_number integer;
declare _place_addr_land varchar(200);
declare _latitude double;
declare _longitude double;
declare _distance double;
declare _cnt integer;

delete from dis_cal_wifi where wifi_number > 0;
set _cnt = (_page-1)*_limit;
		_loop: LOOP
			set _cnt = _cnt + 1;
			select wifi_number, place_addr_land, latitude, longitude, cal_distance(wifi_number)
				into _wifi_number, _place_addr_land, _latitude, _longitude, _distance from freewifi 
				where wifi_number = _cnt;
			
			insert into dis_cal_wifi value (_wifi_number, _place_addr_land, _latitude, _longitude, _distance);
           
			if _cnt = (_page*_limit) then
			leave _loop;
		end if;
	end LOOP _loop;
END $$
DELIMITER ;


show global variables like 'log_bin_trust_function_creators';
SET Global log_bin_trust_function_creators = 'ON';

#거리 계산하는 함수
drop function if exists cal_distance;
DELIMITER $$
create function cal_distance(_wifi_number integer) returns double
begin
	declare _latitude double;
    declare _longitude double;
    declare _plat double;
    declare _plong double;
	declare _dis double;
    
    set _plat = 37.3860521;
	set _plong = 127.1214038;
    
    select latitude, longitude
    into _latitude, _longitude from freewifi where wifi_number = _wifi_number;
    
    set _dis = (6371*acos(cos(radians(_plat))*cos(radians(_latitude))*cos(radians(_longitude)
		-radians(_plong))+sin(radians(_plat))*sin(radians(_latitude))));
	return _dis;
end $$
DELIMITER ;








#########################################
#거리까지 들어가 있는 freewifi 전체 table
#########################################

#거리까지 들어가 있는 테이블
drop table if exists freewifi_dis;
create table freewifi_dis (wifi_number int not null primary key , place_addr_land varchar(200), 
	latitude double, longitude double, distance double);
desc freewifi_dis;



#dis_cal_wifi에 data insert하는 procedure
DROP PROCEDURE IF EXISTS insert_distance;
DELIMITER $$
create procedure insert_distance()
BEGIN
declare _wifi_number integer;
declare _place_addr_land varchar(300);
declare _latitude double;
declare _longitude double;
declare _distance double;
declare _cnt integer;
declare _wificnt integer;

delete from freewifi_dis where wifi_number > 0;
set _cnt = 0;
set _wificnt = (select count(*) from freewifi);
		_loop: LOOP
			set _cnt = _cnt + 1;
			select wifi_number, place_addr_land, latitude, longitude, cal_distance(wifi_number)
				into _wifi_number, _place_addr_land, _latitude, _longitude, _distance from freewifi 
				where wifi_number = _cnt;
			
			insert into freewifi_dis value (_wifi_number, _place_addr_land, _latitude, _longitude, _distance);
           
			if _cnt = _wificnt then
			leave _loop;
		end if;
	end LOOP _loop;
END $$
DELIMITER ;

#freewifi_dis 테이블에 거리계산한 값까지 더해서 입력
call insert_distance();
select * from freewifi_dis limit 7300,101;



