create table users(
id varchar2(8), 
name varchar2(10), 
addr varchar2(10));

create table carinfo(
c_num varchar2(4),   --자동차 번호
c_name varchar2(10),  -- 자동차 종류
 id varchar2(8));
 
insert into users values ('1111','kim','수원');
insert into users values ('2222','lee','서울');
insert into users values ('3333','park','대전');
insert into users values ('4444','choi','대전');

insert into carinfo values ('1234','중형','1111');
insert into carinfo values ('3344','소형','1111');
insert into carinfo values ('5566','중형','3333');
insert into carinfo values ('6677','중형','3333');
insert into carinfo values ('7788','중형','4444');
insert into carinfo values ('8888','중형','5555');

-- 1. 회원의 이름과 주소를 출력하시오.
select name, addr
from users;

-- 2. 회원의 이름과 소유한 자동차 번호를 출력하시오.
select u.name, c.c_num
from users u, carinfo c
where u.id = c.id;

-- 3. 자동차 번호가 7788인 소유자의 이름과 주소를 출력하시오.
select u.name, u.addr
from users u, carinfo c
where u.id = c.id and c.c_num = 7788;

-- 4. 자동차를 소유하지 않은 사람의 이름과 주소를 출력하시오.
select u.name, u.addr
from users u
left outer join carinfo c
on u.id = c.id
where c.c_num is null;

-- 5. 회원별 등록한 자동차 수를 출력하시오.
select u.name, count(*)
from users u, carinfo c
where u.id = c.id
group by u.name;

select u.name, count(*)
from users u, carinfo c
where u.id = c.id
group by (u.name, u.id);   -- 두개가 겹치는 그룹으로 선정

select distinct u.id, u.name, count(*) over(partition by c.id)
from users u, carinfo c
where u.id = c.id;

-- 6. 2대 이상을 소유한 회원의 이름과 소유한 자동차 수를 출력하시오.
select u.name, count(c.c_num)
from users u, carinfo c
where u.id = c.id
group by u.name having count(c.c_num) >= 2;

-- 7. 자동차는 등록되어 있는데 소유자가 없는 자동차 번호를 출력하시오.
select c.c_num
from users u
right outer join carinfo c
on u.id = c.id
where u.id is null;


-- 추가 문제
create table companycar(     -- 자동차 정보
c_num varchar2(4),   -- 차번호
c_com varchar2(30), 
c_name varchar2(10),  -- 차이름
c_price number);  -- 차 가격

insert into companycar values ('1234','현다','소나타',1000);
insert into companycar values ('3344','기와','축제',2000);
insert into companycar values ('7788','기와','레2',800);
insert into companycar values ('9900','현다','그랭저',2100);

-- 8. 배정 자동차의 차번호, 제조사, 자동차명, 가격을 출력하시오.
select c.c_num, com.c_com, com.c_name, com.c_price
from carinfo c, companycar com
where c.c_num = com.c_num;

-- 9. 회사에서구매는 하였지만 배정되지 않은 자동차의 차번호, 제조자, 자동차 이름을 출력.
select com.c_num, com.c_com, com.c_name
from carinfo c
right outer join companycar com
on c.c_num = com.c_num
where c.c_num is null;

select com.c_num, com.c_com, com.c_name
from carinfo c, companycar com
where c.c_num(+) = com.c_num and c.c_num is null;

-- 10. 자동차 가격이 1000만원 이상인 자동차의 자동차 번호를 출력하시오.
select c_num
from companycar
where c_price >= 1000;

-- 11. 배정된 자동차 중에 회사에서 구매한 자동차가 아닌 자동차 번호를 출력하시오.
select c.c_num
from carinfo c
left outer join companycar com
on c.c_num = com.c_num
where com.c_num is null;

select c.c_num
from carinfo c, companycar com
where c.c_num = com.c_num(+) and com.c_num is null;

-- 12. 모든 사람의 정보를 출력하시오. 이름, 배정받은 자동차번호, 자동차이름
select u.name 이름, nvl(c.c_num,'없음') 자동차번호, nvl(com.c_name,'없음') 자동차이름
from users u
left outer join carinfo c
on u.id = c.id
left outer join companycar com
on c.c_num = com.c_num;




