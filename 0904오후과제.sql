create table users(
id varchar2(8), 
name varchar2(10), 
addr varchar2(10));

create table carinfo(
c_num varchar2(4),   --�ڵ��� ��ȣ
c_name varchar2(10),  -- �ڵ��� ����
 id varchar2(8));
 
insert into users values ('1111','kim','����');
insert into users values ('2222','lee','����');
insert into users values ('3333','park','����');
insert into users values ('4444','choi','����');

insert into carinfo values ('1234','����','1111');
insert into carinfo values ('3344','����','1111');
insert into carinfo values ('5566','����','3333');
insert into carinfo values ('6677','����','3333');
insert into carinfo values ('7788','����','4444');
insert into carinfo values ('8888','����','5555');

-- 1. ȸ���� �̸��� �ּҸ� ����Ͻÿ�.
select name, addr
from users;

-- 2. ȸ���� �̸��� ������ �ڵ��� ��ȣ�� ����Ͻÿ�.
select u.name, c.c_num
from users u, carinfo c
where u.id = c.id;

-- 3. �ڵ��� ��ȣ�� 7788�� �������� �̸��� �ּҸ� ����Ͻÿ�.
select u.name, u.addr
from users u, carinfo c
where u.id = c.id and c.c_num = 7788;

-- 4. �ڵ����� �������� ���� ����� �̸��� �ּҸ� ����Ͻÿ�.
select u.name, u.addr
from users u
left outer join carinfo c
on u.id = c.id
where c.c_num is null;

-- 5. ȸ���� ����� �ڵ��� ���� ����Ͻÿ�.
select u.name, count(*)
from users u, carinfo c
where u.id = c.id
group by u.name;

select u.name, count(*)
from users u, carinfo c
where u.id = c.id
group by (u.name, u.id);   -- �ΰ��� ��ġ�� �׷����� ����

select distinct u.id, u.name, count(*) over(partition by c.id)
from users u, carinfo c
where u.id = c.id;

-- 6. 2�� �̻��� ������ ȸ���� �̸��� ������ �ڵ��� ���� ����Ͻÿ�.
select u.name, count(c.c_num)
from users u, carinfo c
where u.id = c.id
group by u.name having count(c.c_num) >= 2;

-- 7. �ڵ����� ��ϵǾ� �ִµ� �����ڰ� ���� �ڵ��� ��ȣ�� ����Ͻÿ�.
select c.c_num
from users u
right outer join carinfo c
on u.id = c.id
where u.id is null;


-- �߰� ����
create table companycar(     -- �ڵ��� ����
c_num varchar2(4),   -- ����ȣ
c_com varchar2(30), 
c_name varchar2(10),  -- ���̸�
c_price number);  -- �� ����

insert into companycar values ('1234','����','�ҳ�Ÿ',1000);
insert into companycar values ('3344','���','����',2000);
insert into companycar values ('7788','���','��2',800);
insert into companycar values ('9900','����','�׷���',2100);

-- 8. ���� �ڵ����� ����ȣ, ������, �ڵ�����, ������ ����Ͻÿ�.
select c.c_num, com.c_com, com.c_name, com.c_price
from carinfo c, companycar com
where c.c_num = com.c_num;

-- 9. ȸ�翡�����Ŵ� �Ͽ����� �������� ���� �ڵ����� ����ȣ, ������, �ڵ��� �̸��� ���.
select com.c_num, com.c_com, com.c_name
from carinfo c
right outer join companycar com
on c.c_num = com.c_num
where c.c_num is null;

select com.c_num, com.c_com, com.c_name
from carinfo c, companycar com
where c.c_num(+) = com.c_num and c.c_num is null;

-- 10. �ڵ��� ������ 1000���� �̻��� �ڵ����� �ڵ��� ��ȣ�� ����Ͻÿ�.
select c_num
from companycar
where c_price >= 1000;

-- 11. ������ �ڵ��� �߿� ȸ�翡�� ������ �ڵ����� �ƴ� �ڵ��� ��ȣ�� ����Ͻÿ�.
select c.c_num
from carinfo c
left outer join companycar com
on c.c_num = com.c_num
where com.c_num is null;

select c.c_num
from carinfo c, companycar com
where c.c_num = com.c_num(+) and com.c_num is null;

-- 12. ��� ����� ������ ����Ͻÿ�. �̸�, �������� �ڵ�����ȣ, �ڵ����̸�
select u.name �̸�, nvl(c.c_num,'����') �ڵ�����ȣ, nvl(com.c_name,'����') �ڵ����̸�
from users u
left outer join carinfo c
on u.id = c.id
left outer join companycar com
on c.c_num = com.c_num;




