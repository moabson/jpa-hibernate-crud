package br.edu.uncisal.shoppingcart.dao;

import java.util.List;

import br.edu.uncisal.shoppingcart.model.User;

public class UserDao extends GenericDao<User, Long> {

	public UserDao(Class<User> classe) {
		super(classe);
	}
	
	@Override
	public List<User> findAll() {
		String query = "from User u inner join fetch u.acessLevel";
		
		return this.em.createQuery(query, this.classe).getResultList();	
	}

	
	public List<User> findAllAdminUsers() {
		String query = "from User u inner join fetch u.acessLevel where u.acessLevel like %ADMIN% ";
		
		return this.em.createQuery(query, this.classe).getResultList();
		
	}

}
