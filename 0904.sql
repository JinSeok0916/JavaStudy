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

-- join : 1�� �̻��� ���̺��� �������� ��ġ�� ��
-- ���� : full join - �ΰ��� ���̺��� ��� ��ġ�� ��. ����� n*m�� �� ��ŭ ������ �Ǿ� Ʃ���� ���������.
--       inner join - ������ �����ϰ� ���ǿ� ���� ��쿡�� �����Ѵ�. �����̳�����(==), �񵿵��̳�����(!=)�� �ִ�.
--       outer join - inner join�� ���ο� �������� ���� Ʃ�ñ��� ����Ѵ�. left outer, join right outer join�� �ִ�.

-- ������ ���� > � ���̺��� ��������. � ������ �������.

-- full join (���������� �ӵ��� �������Ƿ� ���� ���� �ʴ´�.)
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


-- ������ �� �л����� �̸��� ����� ������ ����Ͻÿ�.
select s.name, p.e_name, p.e_point
from stu s, pp p
where s.no = p.no;

-- hong�� �̸��� ����� ������ ����Ͻÿ�.
select s.name, p.e_name, p.e_point
from stu s, pp p
where s.no = p.no and s.name = 'hong';

-- ������ ġ���� ���� �л����� �̸��� ����Ͻÿ�.
select *
from stu s
left outer join pp p
on s.no = p.no
where p.no is null;





