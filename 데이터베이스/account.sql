drop table accnum;

CREATE table accnum(
cuname varchar2(10),
cunum NUMBER PRIMARY key,
accnum varchar2(5) not null,
pass number,
money number
);
INSERT into accnum VALUES('�Ӹ�ö',numadd.nextval,'1234',1231,10000);
INSERT into accnum VALUES('����',numadd.nextval,'5678',1231,10000);
UPDATE accnum SET money='1000' WHERE accnum='1241';

select
*
from accnum where accnum=23;

commit;

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
