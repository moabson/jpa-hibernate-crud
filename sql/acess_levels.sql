create table acess_levels (
	id serial primary key not null,
	name varchar(255) not null
);

insert into acess_levels (name) values ('ADMIN');
insert into acess_levels (name) values ('USER');