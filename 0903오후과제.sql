create table muser(
id int,
reg_num varchar2(8) not null,
name varchar2(10 char),
grade int,
salary int,
time int);

drop table muser;

create sequence muser_no
increment by 1
start with 10
;

insert into muser values(muser_no.nextval,'870205-1','이승진',1,10000,34);
insert into muser values(muser_no.nextval,'880405-1','박이진',2,20000,31);
insert into muser values(muser_no.nextval,'920715-2','최이수',4,40000,32);
insert into muser values(muser_no.nextval,'010205-3','류진아',1,10000,30);
insert into muser values(muser_no.nextval,'810205-2','오현식',2,20000,34);
insert into muser values(muser_no.nextval,'820219-2','정승우',3,30000,35);
insert into muser values(muser_no.nextval,'020205-3','이재수',1,10000,30);
insert into muser values(muser_no.nextval,'970214-2','박지영',2,20000,31);
insert into muser values(muser_no.nextval,'040205-4','정은아',4,40000,31);
insert into muser values(muser_no.nextval,'770225-1','정재영',5,50000,30);
insert into muser values(muser_no.nextval,'770905-2','이신수',4,40000,34);
insert into muser values(muser_no.nextval,'050208-3','이발끈',2,20000,30);
insert into muser values(muser_no.nextval,'051205-4','이욱이',1,10000,34);
insert into muser values(muser_no.nextval,'891215-1','지승아',3,30000,30);
insert into muser values(muser_no.nextval,'670805-1','현진수',2,20000,34);
insert into muser values(muser_no.nextval,'840207-1','최이런',1,10000,35);
insert into muser values(muser_no.nextval,'770405-1','이천안',1,10000,31);


-- 1. grade가 3인 사람은 모두 몇명인가요?
select count(*)
from muser
where grade = 3;

-- 2. grade가 1,2,4인 사람들의 salary의 평균을 구하시오.
select avg(salary)
from muser
where grade = 1 or grade = 2 or grade = 4; -- where grade in (1,2,4) 와 같음

-- 3. salary가 20000 미만인 사람은 총 몇명입니까?
select count(*)
from muser
where salary < 20000;

-- 4. salary가 30000 이상인 사람의 salary 평균을 구하시오.
select avg(salary)
from muser
where salary >= 30000;

-- 5. 32세중에  salary가 가장 적은 사람의 이름과 나이와 salary를 출력하시오.
select name, reg_num, salary
from muser
where salary = (select min(salary)
from muser
where 92 = substr(reg_num,1,2)) and 92 = substr(reg_num,1,2);

select name,
case when substr(reg_num,length(reg_num)) in (1,2) then (substr(sysdate,1,2)+100-substr(reg_num,1,2))
     when substr(reg_num,length(reg_num)) in (3,4) then (substr(sysdate,1,2)-substr(reg_num,1,2))
     end 나이, salary
from muser
where salary = (select min(salary)
from muser
where 32 = (substr(sysdate,1,2)+100-substr(reg_num,1,2))) and 32 = (substr(sysdate,1,2)+100-substr(reg_num,1,2));

-- case when substr(reg_num,length(reg_num)) in (1,2) then (substr(sysdate,1,2)+100-substr(reg_num,1,2))
--      when substr(reg_num,length(reg_num)) in (3,4) then (substr(sysdate,1,2)-substr(reg_num,1,2))
--      end

-- decode

-- 6. 모든 사람의 이름과, 생일(월과 일 예를들어 0205)를 출력하시오.
select name, substr(reg_num,3,4)
from muser;

-- 7. 남자의 평균 급여를 구하시오.
select avg(salary)
from muser
where substr(reg_num,length(reg_num)) in (1,3);

select avg(salary)
from muser
group by mod(substr(reg_num,length(reg_num)),2)
having mod(substr(reg_num,length(reg_num)),2) = 1;

select mod(substr(reg_num,length(reg_num)),2)
from muser;

-- 8. 전체 평균급여보다 높은 급여를 받는 사람의 이름과, 급여를 출력하시오
select name, salary
from muser
where salary > (select avg(salary) from muser);

-- 9. 전체 평균급여보다 높은 급여를 받는 사람의 이름과, 급여, 평균급여를 출력하시오
select name, salary, (select avg(salary) from muser) 전체평균급여, avg(salary) over(partition by time) 높은평균급여, time
from muser
where salary > (select avg(salary) from muser);

-- (select avg(salary) from muser where salary > (select avg(salary) from muser))
-- avg(salary) over()

select * from muser;

-- 본쿼리 select에서 튜플을 하나씩 완성할 때 마다 서브쿼리를 실행하기 때문에 성능은 별로다.
                
-- 10. 여직원의 평균급여보다 높은 남자직원은 모두 몇명입니까
select count(*)
from muser
where (substr(reg_num,length(reg_num)) in (1,3))
       and salary > (select avg(salary)
       from muser
       where substr(reg_num,length(reg_num)) in (2,4));

-- 11. grade별 평균 급여를 출력하세요.
select grade, avg(salary)
from muser
group by grade;

-- 12.그룹별 평균급여가 전체 평균보다 높은 그룹을 출력하시오.
select grade
from muser
group by grade
having avg(salary) > (select avg(salary) from muser);

-- 13. 직원들의 월급 명세서를 출력하시오. (출력 형태는 이름, 월급(grade*salary*time)
select name, grade*salary*time 월급
from muser;

-- 14. 직원들의 성별을 출력하시오. (출력 형태 이름, 성별(성별은 남또는 여로 출력한다)
select name, case when substr(reg_num,length(reg_num)) in (1,3) then '남'
                  else '여'
                  end
from muser;

select name, translate(substr(reg_num,length(reg_num)),'1234','남여남여')
from muser;

select name, decode(substr(reg_num,length(reg_num)),1,'남',3,'남','여')
from muser;

-- 15. time은 근무시간이 근무시간이 31이상인 사람의 이름을 출력하시오.
select name, time
from muser
where time >= 31;

-- 16. 짝수년도에 태어난 사람들의 이름을 모두 출력하시오.
select name, reg_num
from muser
where mod(substr(reg_num,2,1),2) = 0;

-- 17. 직원들의 생년월일을 출력하시오. (출력 형태는 이름과 생년월일(97년1월2일))
select concat(substr(reg_num,1,2),'년')년,
case when substr(reg_num,3,1) = 1 then concat(substr(reg_num,3,2),'월')
     when substr(reg_num,3,1) = 0 then concat(substr(reg_num,4,1),'월')
     end 월,
case when substr(reg_num,5,1) = 1 then concat(substr(reg_num,5,2),'일')
     when substr(reg_num,5,1) = 2 then concat(substr(reg_num,5,2),'일')
     when substr(reg_num,5,1) = 3 then concat(substr(reg_num,5,2),'일')
     when substr(reg_num,5,1) = 0 then concat(substr(reg_num,6,1),'일')
     end 일
from muser;

-- 18. 여직원들의 육아를 지원하기 위한 정책으로 time을 2시간가산하기로 했다. 이를 처리 하시오.


-- 19. 나이별 인원수는 몇명입니까
select substr(reg_num,1,2), count(*)
from muser
group by substr(reg_num,1,2);

-- 20. 2학년그룹과 4학년 그룹은 모두 몇명입니까
select grade, count(grade)
from muser
where grade = 2 or grade = 4
group by grade;


-- 추가문제
-- 1. 모든 사람이 태어난 후 오늘까지 몇 달이 지났는지 출력하시오. (출력형태: 이름, 주민번호, 지금까지살아온월수)


-- 2. time을 나이로 봄. 30~31세의 살아온 월수의 합, 32세 이상의 살아온 월수의 합 구하기
select 
  (select trunc(sum(months_between(sysdate,substr(reg_num,1,6)))) 
   from muser where time in (30,31)) as "30~31",
  (select trunc(sum(months_between(sysdate,substr(reg_num,1,6)))) 
   from muser where time >= 32) as "32" 
from muser;

-- 3. 연령별 급여의 합, over()함수 이용
select distinct time 연령, sum(salary) over(partition by time) 총합
from muser;
-- partition by > 그룹형태로 만들어줌. group by 역할

-- 4. 연령별 인원수, over()함수 이용


-- 5. 등급별 급여의 최고급여, over()함수 이용

