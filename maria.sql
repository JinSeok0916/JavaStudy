CREATE TABLE MEMBER(
id VARCHAR(15) PRIMARY key,
pw VARCHAR(8),
NAME VARCHAR(10),
addr VARCHAR(50),
gender VARCHAR(2),
tel VARCHAR(13),
grade VARCHAR(6));
create table owner(
o_id varchar(15),  
o_pw varchar(8) not null,
o_addr varchar(50),
o_name varchar(10) not null,
o_tel varchar(13),
primary key(o_id)
);
create table food(
f_code int(12) not null,
f_name varchar(50),
f_addr varchar(50),
f_tel varchar(13),
f_menu varchar(20),
primary key(f_name)
);

create table review(
r_name varchar(50) not null,
r_id varchar(15),
r_massege varchar(200) not null check (length(r_massege) >= 10),
r_date_n date DEFAULT SYSDATE(),
r_star INt check(r_star between 1 and 5),
r_secret VARCHAR(6) check (r_secret IN ('공개','비공개'))
);

DROP TABLE review;