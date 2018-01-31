package br.edu.uncisal.shoppingcart.dao;

import java.util.List;

import br.edu.uncisal.shoppingcart.model.User;

public interface UserDao extends Dao<User, Long> {

	public List<User> findAllAdminUsers();
	
}
