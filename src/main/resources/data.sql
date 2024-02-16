drop table if exists  users;

create table if not exists users
(
    id         bigint primary key auto_increment,
    first_name varchar(50)  not null,
    last_name  varchar(50)  not null,
    birthday   date
);

insert into users (first_name, last_name, birthday)
values ('user', 'user', LOCALTIME);