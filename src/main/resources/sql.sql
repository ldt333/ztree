create table TREENODE
(
  id   VARCHAR2(32) default sys_guid(),
  pid  VARCHAR2(32),
  name VARCHAR2(200)
);

insert into TREENODE (ID, PID, NAME)
values ('1', '0', 'aaa');

insert into TREENODE (ID, PID, NAME)
values ('2', '0', 'bbb');

insert into TREENODE (ID, PID, NAME)
values ('3', '0', 'ccc');

insert into TREENODE (ID, PID, NAME)
values ('4', '1', 'aaa-1');

insert into TREENODE (ID, PID, NAME)
values ('5', '1', 'aaa-2');

insert into TREENODE (ID, PID, NAME)
values ('6', '2', 'bbb-1');