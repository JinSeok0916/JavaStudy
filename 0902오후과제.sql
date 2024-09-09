-- 오후과제
create table users(
no int primary key,
name varchar2(10),
addr varchar2(10),
point number,
grade varchar2(1),
jumin varchar2(8));

insert into users values (1,'kimsu','suwon',99.12,1,'820405-1');
insert into users values (2,'leesu','suwon city',89.00,2,'970805-2');
insert into users values (3,'choihee','seoul',88.21,1,'910204-2');
insert into users values (4,'leesil','suwon',77.62,4,'850405-1');
insert into users values (5,'james','seoul',60.22,1,'871105-1');
insert into users values (6,'parksuji','suwon',90.12,3,'880405-2');
insert into users values (7,'kimrae','yougin',89.96,3,'820105-1');
insert into users values (8,'sangJin','youngin',99.31,3,'990420-2');
insert into users values (9,'Leechan','incheon',79.12,2,'970605-2');
insert into users values (10,'kimmi','incheon',79.92,1,'810505-1');
insert into users values (11,'ryusu','seoul',85.32,4,'861205-2');
insert into users values (12,'Gosu',null,82.13,4,'810715-1');

-- 1. 모든 사람들의 이름과 점수와 생년월일을 검색하시오.
select name, point, jumin from users;

-- 2. 80점 이상의 사람의 이름과 주소, 점수를 검색하시오.
select name, addr, point from users where point >= 80;

-- 3. 이름이 kim으로 시작되는 사람의 이름과 주소와 점수를 검색하시오.
select name, addr, point from users where name like 'kim%';

-- 4. 현재 점수에서 +10으로 보정한 점수를 출력하시오. 원본 데이터에 반영되지 않습니다.
select point + 10 from users;

-- 5. 1학년의 점수를 +1점씩 올려서 출력하세요. (단, 원본 데이터에 반영되지 않습니다.)
select point + 1 from users where grade = 1;

-- 6. B등급을 획득한 사람의 이름, 주소, 점수를 출력하세요 (B등급 80점 이상 90점 미만입니다)
select name, addr, point from users where point >= 80 and point < 90;

-- 7. 쿼리 결과 중 NULL은 실제 입력하지 않은 값입니다. 주소를 입력하지 않은 학생의 이름과, 주소, 학년, 점수, 주민번호를 출력하세요
select name, addr, grade, point, jumin from users where addr is null;

-- 8. 4학년의 점수를 10%로 올린 점수를 계산하세요. (단, 원본데이터는 반영되지 않는다)
select point * 1.1 from users where grade = 4;

-- 9. 점수가 낮은 학생부터 출력하세요.  번호, 이름, 주소, 포인트
select no, name, addr, point from users order by point asc;

-- 10. 학년을 오름차순으로 정렬하시오, 단 학년이 동일 할 경우 포인트가 높은 사람이 먼저 출력됩니다. 출력은 번호, 이름, 학년, 포인트
select no, name, grade, point from users order by grade asc, point desc;

-- 11. 현재의 점수에서 -10을 보정한 결과 80점 이상인 사람의 이름과 점수, 보정한 결과 점수를 출력하세요.?
select name, point 현재포인트, point - 10 "보정 포인트" from users where point - 10 >= 80;

-- 12. 2학년의 모든 학생을 출력하시오. 출력 컬럼명은 이름 주소 학년으로 출력하시오. 여기서 이름은 name컬럼, 주소는 addr컬럼, 학년은 grade컬럼을 의미
select name 이름, addr 주소, grade 학년 from users where grade = 2;


-- 추가문제
-- 13. 학생은 총 몇명입니까?
select count(*) from users;

-- 14. 1학년은 총 몇명입니까?
select count(*) from users where grade = 1;

-- 15. 모든 학생의 이름과 학년을 출력하시오. 단 이름은 모두 소문자로만 출력하시오. 
select lower(name), grade from users;

-- 16. 2학년 학생의 이름과 학년을 출력하시오. 보안을 위해서 주소는 앞글자 2글자만 출력하시오.
select name, grade, substr(addr,1,2) from users where grade = 2;

-- 17. 모든 학생의 점수의 일의 자리는 절삭하시오. - 반올림 없음 (단, 원본 데이터에 반영되지 않습니다.)
select trunc(point,-1) from users;

-- 18. 모든 학생의 점수를 반올림하여 출력하시오. (단, 원본 데이터에 반영되지 않습니다.)
select round(point,0) from users;

-- 19. 2학년은 모두 몇명입니까?
select count(*) from users where grade = 2;

-- 20. 1학년중 80점 이상은 몇명입니까?
select count(*) from users where grade = 1 and point >= 80;

-- 21. 3학년의 평균은 몇점입니까?
select avg(grade) from users where grade = 3;

-- 22. 전체 학생 중 최고점은 몇점입니까?
select max(point) from users;

-- 23. 2학년 중 가장 낮은 점수를 획득한 점수는 몇점입니까
select min(point) from users where grade = 2;


-- 못푸는 문제
-- 24.보안을 위해서 주소를 모두 출력하지 않고 앞의 세 글자만 출력하고 뒤에 *를 하나 붙힌다. (단, 원본 데이터에 반영되지 않습니다.) 예)suwon  >> su*
select concat(substr(addr,1,2),'*') from users;

-- 25. 이름의 맨 앞에 *를 맨 뒤에도*를 붙혀서 출력한다. (단, 원본 데이터에 반영되지 않습니다.)
select concat('*',concat(substr(name,2,length(name)-2),'*')) from users;

-- 26. 생년월일을 그대로 출력하지 말고 xx 년 xx 월 xx 일 형식으로 출력한다. (단, 원본 데이터에 반영되지 않습니다. 성별은 무시한다)
select concat(substr(jumin,1,2),'년') 년, concat(substr(jumin,3,2),'월') 월, concat(substr(jumin,5,2),'일') 일 from users;

-- 27. 이름, 포인트, 학년, 생년월일, 성별을 추가한다. 성별은 생년월일로 판단하며 마지막 숫자가 1이면 남 2이면 여라고 표시한다.
select translate(substr(jumin,length(jumin)),'12','남여') from users;


-- 추가문제
-- 1. 모든 사람의 이름과 주민번호를 출력하고 나이를 출력하시오.
select name, jumin, (substr(sysdate,1,2)-substr(jumin,1,2))+100 나이 from users;

-- 2. 모든 사람의 정보를 출력하세요. 단, 이름을 마스킹하세요. 마스킹 방법은 첫글자는 그대로 나머지는 *, * 갯수는 이름의 길이보다 하나 적다.
select concat(substr(name,1,1),translate(substr(name,2,length(name)-2),'abcdefghijklmnopqrstuvwxyz','**************************')) from users;

-- 3. 모든 사람의 정보를 출력하시오. 1학년은 이름뒤에 *, 2학년은 이름 뒤에 %, 3학년은 이름뒤에 #, 4학년은 이름뒤에 !를 추가하여 출력하시오.
select case when grade = 1 then concat(name,'*')
            when grade = 2 then concat(name,'%')
            when grade = 3 then concat(name,'#')
            when grade = 4 then concat(name,'!')
            end from users;


-- 0903
select grade, count(*) 인원수 from users group by grade order by grade asc;
select max(point), min(point) from users group by grade;
select grade, max(point) from users group by grade;

-- 1. 3학년과 4학년 각각 그룹의 인원수를 출력하시오.
select grade, count(*) from users where grade = 3 or grade = 4 group by grade;

-- 2. 1학년과 2학년의 최고점과 최저점의 점수 차이를 출력하시오.
select grade, max(point)-min(point) from users where grade = 1 or grade = 2 group by grade;

-- 3. 주민번호 앞 두자리는 태어난 년도이다. 같은 년도에 태어난 사람을 카운팅 하시오. 이 때 태어난 년도와 인원수로 출력한다.
select substr(jumin,1,2) "태어난 년도", count(*) 인원수 from users group by substr(jumin,1,2) order by substr(jumin,1,2) asc;

-- having 그룹의 조건
select grade, count(*) from users group by grade having count(*) >= 3;

-- 서브쿼리
select grade, avg(point) from users group by grade having avg(point) >= (select avg(point) from users);

-- 가장 높은 점수를 획득한 사람의 이름과 점수는?
select name, point from users where (select max(point) from users) = point;


