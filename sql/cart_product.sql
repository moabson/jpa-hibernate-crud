create table cart_product (

	id serial primary key not null,
	cart_id integer not null,
	product_id integer not null,
	

	FOREIGN KEY (cart_id) REFERENCES carts (id),
	FOREIGN KEY (product_id) REFERENCES products (id)
	
);