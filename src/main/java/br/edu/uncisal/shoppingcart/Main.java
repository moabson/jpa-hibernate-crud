package br.edu.uncisal.shoppingcart;

import java.util.List;

import br.edu.uncisal.shoppingcart.dao.CartDao;
import br.edu.uncisal.shoppingcart.dao.UserDao;
import br.edu.uncisal.shoppingcart.dao.impl.CartDaoImpl;
import br.edu.uncisal.shoppingcart.dao.impl.UserDaoImpl;
import br.edu.uncisal.shoppingcart.model.Cart;
import br.edu.uncisal.shoppingcart.model.Product;
import br.edu.uncisal.shoppingcart.model.User;
import br.edu.uncisal.shoppingcart.service.CartService;

public class Main {

	public static void main(String[] args) {

				
		UserDao userDao = new UserDaoImpl(User.class);
		//Dao<AcessLevel, Long> acessLevelDao = new GenericDao<AcessLevel, Long>(AcessLevel.class);
		
		userDao.findAll();
		
		List<User> users = userDao.findAllAdminUsers();
		
		for (User u : users) {
			System.out.println(u);			
		}
		
		
		CartDao cartDao = new CartDaoImpl(Cart.class);
		
		CartService service = new CartService();
		
		Cart cart = cartDao.findById(1L);
		
		List<Product> products = service.getAllCartProducts(cart);
		
		for (Product product : products) {
			System.out.println(product.getName());
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
