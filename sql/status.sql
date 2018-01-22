create table status (

	id serial primary key not null,
	name varchar(255) not null
	
);

insert into status (name) values ('AGUARDANDO_PAGAMENTO');
insert into status (name) values ('PAGAMENTO_EFETUADO');
insert into status (name) values ('PRODUTO_ENVIADO');
insert into status (name) values ('PRODUTO_RECEBIDO');