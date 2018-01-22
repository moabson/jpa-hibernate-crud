create table carts (

	id serial primary key not null,
	user_id integer not null,
	total numeric,
	status_id integer not null,
	
	FOREIGN KEY (user_id) REFERENCES users (id),
	FOREIGN KEY (status_id) REFERENCES status (id)
	
	
);