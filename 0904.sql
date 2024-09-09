create table stu(
no number,
name varchar2(5 char),
tel varchar2(13));

create table pp(
no number,
e_name varchar2(4),
e_point number(3));

insert into stu values (1,'hong','1111');
insert into stu values (2,'kim','2222');
insert into stu values (3,'lee','3333');
insert into pp values (1,'java','70');
insert into pp values (1,'html','90');
insert into pp values (3,'java','80');

commit;

select * from stu;
select * from pp;

-- join : 1개 이상의 테이블을 논리적으로 합치는 것
-- 종류 : full join - 두개의 테이블을 모두 합치는 것. 결과는 n*m의 수 만큼 조인이 되어 튜플이 만들어진다.
--       inner join - 조건을 제시하고 조건에 참일 경우에만 조인한다. 동등이너조인(==), 비동등이너조인(!=)이 있다.
--       outer join - inner join에 조인에 참여하지 않은 튜플까지 출력한다. left outer, join right outer join이 있다.

-- 공부의 방향 > 어떤 테이블을 조인할지. 어떤 조인을 사용할지.

-- full join (현업에서는 속도가 느려지므로 절대 하지 않는다.)
select *
from stu, pp;

-- inner join
select s.no, s.name, s.tel, p.no, p.e_name, p.e_point
from stu s, pp p
where s.no = p.no;

select s.no, s.name, s.tel, p.no, p.e_name, p.e_point
from stu s
inner join pp p
on s.no = p.no;

-- outer join
select s.no, s.name, s.tel, p.no, p.e_name, p.e_point
from stu s
left outer join pp p   -- left outer join / left table : stu
on s.no = p.no;

select s.no, s.name, s.tel, p.no, p.e_name, p.e_point
from stu s
right outer join pp p   -- right outer join / right table : pp
on s.no = p.no;


-- 시험을 본 학생들의 이름과 과목과 점수를 출력하시오.
select s.name, p.e_name, p.e_point
from stu s, pp p
where s.no = p.no;

-- hong의 이름과 과목과 점수를 출력하시오.
select s.name, p.e_name, p.e_point
from stu s, pp p
where s.no = p.no and s.name = 'hong';

-- 시험을 치루지 않은 학생들의 이름을 출력하시오.
select *
from stu s
left outer join pp p
on s.no = p.no
where p.no is null;





