create table users (

	id serial primary key not null,
	username varchar(255),
	password text,
	name varchar(255),
	email varchar(255),
	acess_level_id smallint not null,
	
	FOREIGN KEY (acess_level_id) REFERENCES acess_levels (id)
	
);


insert into users (username, password, name, email, acess_level_id) 
	values ('andre', '123', 'André Moabson', 'andre.ramos@uncisal.edu.br', 1);

insert into users (username, password, name, email, acess_level_id) 
	values ('teste', '123', 'Fulano de Tal', 'fulano.tal@uncisal.edu.br', 2);

