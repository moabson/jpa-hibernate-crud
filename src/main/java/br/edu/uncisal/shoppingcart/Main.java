package br.edu.uncisal.shoppingcart;

import java.util.List;

import br.edu.uncisal.shoppingcart.dao.Dao;
import br.edu.uncisal.shoppingcart.dao.GenericDao;
import br.edu.uncisal.shoppingcart.dao.UserDao;
import br.edu.uncisal.shoppingcart.model.AcessLevel;
import br.edu.uncisal.shoppingcart.model.User;

public class Main {

	public static void main(String[] args) {

				
		UserDao userDao = new UserDao(User.class);
		//Dao<AcessLevel, Long> acessLevelDao = new GenericDao<AcessLevel, Long>(AcessLevel.class);
		
		List<User> users = userDao.findAll();
		
		
		for (User u : users) {
			System.out.println(u);			
		}
		
		/*		
		
		User newUser = new User();
		newUser.setName("Teste Fulaninho");
		newUser.setEmail("moabsond2@gmail.com");
		newUser.setPassword("123");
		newUser.setUsername("teste");

		newUser.setAcessLevel(acessLevelDao.findById(2L));
		
		userDao.save(newUser);
		
		*/
	

	}

}
