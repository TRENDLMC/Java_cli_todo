drop table accnum;

CREATE table accnum(
cuname varchar2(10),
cunum NUMBER PRIMARY key,
accnum varchar2(5) not null,
pass number,
meney number
);


INSERT into accnum VALUES('�Ӹ�ö',numadd.nextval,'1241',1231,10000);




select
*
from accnum;


drop SEQUENCE numadd;

CREATE SEQUENCE numadd
INCREMENT by 1
START with 1;


create table member(
id char(4),
name varchar2(10),
height number,
weight number,
age number
);
insert into member(id,name,height,weight,age) VALUES('0001','ȫ�浿',175,67,24);

insert into member(id,name,height,weight,age) VALUES('0002','�Ӳ���',188,78,45);

commit




       
