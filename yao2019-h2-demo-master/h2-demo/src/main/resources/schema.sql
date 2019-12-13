create table if not exists User(
id int not null primary key,
username varchar(100),
name varchar(100),
age smallint,
balance numeric);