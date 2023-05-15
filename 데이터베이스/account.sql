drop index idx_accnum;
drop table accnum;
drop SEQUENCE numadd;




CREATE table accnum(
cuname varchar2(10),
cunum NUMBER PRIMARY key,
accnum varchar2(5) not null,
pass number,
money number
);

CREATE SEQUENCE numadd
INCREMENT by 1
START with 1;

create index idx_accnum on accnum(accnum);

commit;
