create table if not exists bookstore_user ( id bigint primary key,
login varchar(50) not null,
password varchar(250) not null,
birth_date datetime not null,
age bigint not null );


insert into service_users.bookstore_user (id, login, password, age)
values (1, 'dath', '$2a$10$xzYpKFy48SanpwyfxPp/p.lqQDHaeCBgZjm/xgpc74CGzIBUftffy', 20); -- encoded 'the-password'