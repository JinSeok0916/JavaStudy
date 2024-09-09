create table hm(
no number(3) primary key,
name varchar2(10) not null,
point number(5) default 0,
addr varchar2(20),
indate timestamp default sysdate);
insert into hm values (1,'홍길동',45,'서울시',default);
insert into hm values (2,'일지매',50,'수원',default);
insert into hm values (3,'이지매',43,'서울',default);

select name, point from hm;
select name, point from hm where point<=50;
select count(*) from hm where point <= 50;
select point as 포인트 from hm where name='홍길동';
select * from hm where name = '일지매';

select name,point+10 from hm;
select name 이름, point 현재포인트, point+10 가산포인트 from hm;
select * from hm;
update hm set point = 100, name = '김티처' where name = '홍길동';
delete from hm where name = '삼지매';

select concat('이름','님') 이름 from dual; -- dual : 오라클에서 제공하는 가상테이블
select sysdate from dual;

-- 1. 모든 사람의 이름과 포인트를 출력하되, 이름에 '님'을 붙혀서 출력하세요.
select concat(name,'님') name, point from hm;
-- 2. 모든 사람의 이름과 포인트, 등록일을 출력하되, 가입순서에 따라 나중에 가입한 사람이 제일 먼저 출력되도록 하세요. 가입날짜는 indate
select name, point, indate from hm order by indate desc;
-- 3. 포인트가 50 이상인 사람의 이름과 정보를 출력하되, 정보는 no,name,point가 합쳐진 문자열로 출력하세요.
select name 이름, concat(no,concat(name,point)) 정보 from hm where point >= 50;
-- 4. 기준포인트가 60일 때 모든 회원이 기준포인트를 맞추기 위한 부족한 포인트를 출력하세요. 출력은 이름 현재포인트 부족한포인트.
select name 이름, point 현재포인트, 60-point 부족한포인트 from hm where point < 60;

