####创建表

```sql
create table users(
id int(5) primary key,
username varchar (40),
password varchar (40)
);
INSERT into users VALUES (2222,'lsq','sLrunSedNPod/XGq25CMPw==');
INSERT into users VALUES (3333,'lhr','lueSGJZetyySpUndWjMBEg==');
```
```sql
create table stock(
code varchar(5) primary key,
name varchar(40),
amt varchar(40),
price double
);
insert into stock values (3701,'5号电池',100,3.12),
(9527,'刮胡刀',100,32.00);
```
```sql
create table record(
code varchar(5) primary key,
name varchar(40),
num int,
price double
);
```
```sql
create table total(
code varchar(5) primary key,
num int,
amt varchar(40),
money double
)
```
















