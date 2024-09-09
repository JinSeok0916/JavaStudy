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

insert into muser values(muser_no.nextval,'870205-1','�̽���',1,10000,34);
insert into muser values(muser_no.nextval,'880405-1','������',2,20000,31);
insert into muser values(muser_no.nextval,'920715-2','���̼�',4,40000,32);
insert into muser values(muser_no.nextval,'010205-3','������',1,10000,30);
insert into muser values(muser_no.nextval,'810205-2','������',2,20000,34);
insert into muser values(muser_no.nextval,'820219-2','���¿�',3,30000,35);
insert into muser values(muser_no.nextval,'020205-3','�����',1,10000,30);
insert into muser values(muser_no.nextval,'970214-2','������',2,20000,31);
insert into muser values(muser_no.nextval,'040205-4','������',4,40000,31);
insert into muser values(muser_no.nextval,'770225-1','���翵',5,50000,30);
insert into muser values(muser_no.nextval,'770905-2','�̽ż�',4,40000,34);
insert into muser values(muser_no.nextval,'050208-3','�̹߲�',2,20000,30);
insert into muser values(muser_no.nextval,'051205-4','�̿���',1,10000,34);
insert into muser values(muser_no.nextval,'891215-1','���¾�',3,30000,30);
insert into muser values(muser_no.nextval,'670805-1','������',2,20000,34);
insert into muser values(muser_no.nextval,'840207-1','���̷�',1,10000,35);
insert into muser values(muser_no.nextval,'770405-1','��õ��',1,10000,31);


-- 1. grade�� 3�� ����� ��� ����ΰ���?
select count(*)
from muser
where grade = 3;

-- 2. grade�� 1,2,4�� ������� salary�� ����� ���Ͻÿ�.
select avg(salary)
from muser
where grade = 1 or grade = 2 or grade = 4; -- where grade in (1,2,4) �� ����

-- 3. salary�� 20000 �̸��� ����� �� ����Դϱ�?
select count(*)
from muser
where salary < 20000;

-- 4. salary�� 30000 �̻��� ����� salary ����� ���Ͻÿ�.
select avg(salary)
from muser
where salary >= 30000;

-- 5. 32���߿�  salary�� ���� ���� ����� �̸��� ���̿� salary�� ����Ͻÿ�.
select name, reg_num, salary
from muser
where salary = (select min(salary)
from muser
where 92 = substr(reg_num,1,2)) and 92 = substr(reg_num,1,2);

select name,
case when substr(reg_num,length(reg_num)) in (1,2) then (substr(sysdate,1,2)+100-substr(reg_num,1,2))
     when substr(reg_num,length(reg_num)) in (3,4) then (substr(sysdate,1,2)-substr(reg_num,1,2))
     end ����, salary
from muser
where salary = (select min(salary)
from muser
where 32 = (substr(sysdate,1,2)+100-substr(reg_num,1,2))) and 32 = (substr(sysdate,1,2)+100-substr(reg_num,1,2));

-- case when substr(reg_num,length(reg_num)) in (1,2) then (substr(sysdate,1,2)+100-substr(reg_num,1,2))
--      when substr(reg_num,length(reg_num)) in (3,4) then (substr(sysdate,1,2)-substr(reg_num,1,2))
--      end

-- decode

-- 6. ��� ����� �̸���, ����(���� �� ������� 0205)�� ����Ͻÿ�.
select name, substr(reg_num,3,4)
from muser;

-- 7. ������ ��� �޿��� ���Ͻÿ�.
select avg(salary)
from muser
where substr(reg_num,length(reg_num)) in (1,3);

select avg(salary)
from muser
group by mod(substr(reg_num,length(reg_num)),2)
having mod(substr(reg_num,length(reg_num)),2) = 1;

select mod(substr(reg_num,length(reg_num)),2)
from muser;

-- 8. ��ü ��ձ޿����� ���� �޿��� �޴� ����� �̸���, �޿��� ����Ͻÿ�
select name, salary
from muser
where salary > (select avg(salary) from muser);

-- 9. ��ü ��ձ޿����� ���� �޿��� �޴� ����� �̸���, �޿�, ��ձ޿��� ����Ͻÿ�
select name, salary, (select avg(salary) from muser) ��ü��ձ޿�, avg(salary) over(partition by time) ������ձ޿�, time
from muser
where salary > (select avg(salary) from muser);

-- (select avg(salary) from muser where salary > (select avg(salary) from muser))
-- avg(salary) over()

select * from muser;

-- ������ select���� Ʃ���� �ϳ��� �ϼ��� �� ���� ���������� �����ϱ� ������ ������ ���δ�.
                
-- 10. �������� ��ձ޿����� ���� ���������� ��� ����Դϱ�
select count(*)
from muser
where (substr(reg_num,length(reg_num)) in (1,3))
       and salary > (select avg(salary)
       from muser
       where substr(reg_num,length(reg_num)) in (2,4));

-- 11. grade�� ��� �޿��� ����ϼ���.
select grade, avg(salary)
from muser
group by grade;

-- 12.�׷캰 ��ձ޿��� ��ü ��պ��� ���� �׷��� ����Ͻÿ�.
select grade
from muser
group by grade
having avg(salary) > (select avg(salary) from muser);

-- 13. �������� ���� ������ ����Ͻÿ�. (��� ���´� �̸�, ����(grade*salary*time)
select name, grade*salary*time ����
from muser;

-- 14. �������� ������ ����Ͻÿ�. (��� ���� �̸�, ����(������ ���Ǵ� ���� ����Ѵ�)
select name, case when substr(reg_num,length(reg_num)) in (1,3) then '��'
                  else '��'
                  end
from muser;

select name, translate(substr(reg_num,length(reg_num)),'1234','��������')
from muser;

select name, decode(substr(reg_num,length(reg_num)),1,'��',3,'��','��')
from muser;

-- 15. time�� �ٹ��ð��� �ٹ��ð��� 31�̻��� ����� �̸��� ����Ͻÿ�.
select name, time
from muser
where time >= 31;

-- 16. ¦���⵵�� �¾ ������� �̸��� ��� ����Ͻÿ�.
select name, reg_num
from muser
where mod(substr(reg_num,2,1),2) = 0;

-- 17. �������� ��������� ����Ͻÿ�. (��� ���´� �̸��� �������(97��1��2��))
select concat(substr(reg_num,1,2),'��')��,
case when substr(reg_num,3,1) = 1 then concat(substr(reg_num,3,2),'��')
     when substr(reg_num,3,1) = 0 then concat(substr(reg_num,4,1),'��')
     end ��,
case when substr(reg_num,5,1) = 1 then concat(substr(reg_num,5,2),'��')
     when substr(reg_num,5,1) = 2 then concat(substr(reg_num,5,2),'��')
     when substr(reg_num,5,1) = 3 then concat(substr(reg_num,5,2),'��')
     when substr(reg_num,5,1) = 0 then concat(substr(reg_num,6,1),'��')
     end ��
from muser;

-- 18. ���������� ���Ƹ� �����ϱ� ���� ��å���� time�� 2�ð������ϱ�� �ߴ�. �̸� ó�� �Ͻÿ�.


-- 19. ���̺� �ο����� ����Դϱ�
select substr(reg_num,1,2), count(*)
from muser
group by substr(reg_num,1,2);

-- 20. 2�г�׷�� 4�г� �׷��� ��� ����Դϱ�
select grade, count(grade)
from muser
where grade = 2 or grade = 4
group by grade;


-- �߰�����
-- 1. ��� ����� �¾ �� ���ñ��� �� ���� �������� ����Ͻÿ�. (�������: �̸�, �ֹι�ȣ, ���ݱ�����ƿ¿���)


-- 2. time�� ���̷� ��. 30~31���� ��ƿ� ������ ��, 32�� �̻��� ��ƿ� ������ �� ���ϱ�
select 
  (select trunc(sum(months_between(sysdate,substr(reg_num,1,6)))) 
   from muser where time in (30,31)) as "30~31",
  (select trunc(sum(months_between(sysdate,substr(reg_num,1,6)))) 
   from muser where time >= 32) as "32" 
from muser;

-- 3. ���ɺ� �޿��� ��, over()�Լ� �̿�
select distinct time ����, sum(salary) over(partition by time) ����
from muser;
-- partition by > �׷����·� �������. group by ����

-- 4. ���ɺ� �ο���, over()�Լ� �̿�


-- 5. ��޺� �޿��� �ְ�޿�, over()�Լ� �̿�

