package br.edu.uncisal.shoppingcart.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import br.edu.uncisal.shoppingcart.dao.UserDao;
import br.edu.uncisal.shoppingcart.model.AcessLevelType;
import br.edu.uncisal.shoppingcart.model.User;

public class UserDaoImpl extends JpaGenericDao<User, Long> implements UserDao {
	
	public UserDaoImpl(Class<User> classe) {
		super(classe);
	}

	@Override
	public List<User> findAll() {
		String query = "from User u inner join fetch u.acessLevel";
		
		return this.em.createQuery(query, User.class).getResultList();	
	}
	
	public List<User> findAllAdminUsers() {		
		String queryString = "from User u inner join fetch u.acessLevel where u.acessLevel.name = :level ";
		
		TypedQuery<User> query = this.em.createQuery(queryString, this.classe);
		query.setParameter("level", AcessLevelType.ADMIN);
		
		System.out.println(query);
		
		return query.getResultList();		
	}

}
