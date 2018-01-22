create table products (

	id serial primary key not null,
	name varchar(255),
	price numeric,
	quantity integer
	
);

insert into products (name, price, quantity) values ('Computador Dell Desktop Completo', 999.99, 10);
insert into products (name, price, quantity) values ('TV LCD 24', 557.50, 5);
insert into products (name, price, quantity) values ('Microondas', 230.00, 5);