create table hm(
no number(3) primary key,
name varchar2(10) not null,
point number(5) default 0,
addr varchar2(20),
indate timestamp default sysdate);
insert into hm values (1,'ȫ�浿',45,'�����',default);
insert into hm values (2,'������',50,'����',default);
insert into hm values (3,'������',43,'����',default);

select name, point from hm;
select name, point from hm where point<=50;
select count(*) from hm where point <= 50;
select point as ����Ʈ from hm where name='ȫ�浿';
select * from hm where name = '������';

select name,point+10 from hm;
select name �̸�, point ��������Ʈ, point+10 ��������Ʈ from hm;
select * from hm;
update hm set point = 100, name = '��Ƽó' where name = 'ȫ�浿';
delete from hm where name = '������';

select concat('�̸�','��') �̸� from dual; -- dual : ����Ŭ���� �����ϴ� �������̺�
select sysdate from dual;

-- 1. ��� ����� �̸��� ����Ʈ�� ����ϵ�, �̸��� '��'�� ������ ����ϼ���.
select concat(name,'��') name, point from hm;
-- 2. ��� ����� �̸��� ����Ʈ, ������� ����ϵ�, ���Լ����� ���� ���߿� ������ ����� ���� ���� ��µǵ��� �ϼ���. ���Գ�¥�� indate
select name, point, indate from hm order by indate desc;
-- 3. ����Ʈ�� 50 �̻��� ����� �̸��� ������ ����ϵ�, ������ no,name,point�� ������ ���ڿ��� ����ϼ���.
select name �̸�, concat(no,concat(name,point)) ���� from hm where point >= 50;
-- 4. ��������Ʈ�� 60�� �� ��� ȸ���� ��������Ʈ�� ���߱� ���� ������ ����Ʈ�� ����ϼ���. ����� �̸� ��������Ʈ ����������Ʈ.
select name �̸�, point ��������Ʈ, 60-point ����������Ʈ from hm where point < 60;

