package br.edu.uncisal.shoppingcart.service;

import java.util.List;

import br.edu.uncisal.shoppingcart.dao.CartDao;
import br.edu.uncisal.shoppingcart.dao.Dao;
import br.edu.uncisal.shoppingcart.dao.StatusDao;
import br.edu.uncisal.shoppingcart.dao.UserDao;
import br.edu.uncisal.shoppingcart.dao.impl.CartDaoImpl;
import br.edu.uncisal.shoppingcart.dao.impl.JpaGenericDao;
import br.edu.uncisal.shoppingcart.dao.impl.StatusDaoImpl;
import br.edu.uncisal.shoppingcart.dao.impl.UserDaoImpl;
import br.edu.uncisal.shoppingcart.model.Cart;
import br.edu.uncisal.shoppingcart.model.Product;
import br.edu.uncisal.shoppingcart.model.Status;
import br.edu.uncisal.shoppingcart.model.StatusType;
import br.edu.uncisal.shoppingcart.model.User;

public class CartService {
	
	private CartDao cartDao;
	
	public CartService() {
		this.cartDao = new CartDaoImpl(Cart.class);
	}
	
	public void createCartForUser(User user) {
		
		if (user != null) {
			Cart cart = new Cart();	
			StatusDao statusDao = new StatusDaoImpl(Status.class);
			
			System.out.println("status: " + StatusType.AGUARDANDO_PAGAMENTO.toString());
			
			Status status = statusDao.findByName(StatusType.AGUARDANDO_PAGAMENTO);
			
			cart.setStatus(status);
			cart.setTotal(0.0);
			cart.setUser(user);	
			
			this.cartDao.save(cart);
		}
		
	} 
	
	public void addProductToCart(Product product, Cart cart) {
				
		if (product != null && cart != null) {
			cart.addProduct(product);
			this.cartDao.save(cart);
		}
		
	}
	
	public List<Product> getAllCartProducts(Cart cart) {
		if (cart != null) {
			return this.cartDao.findAllProducts(cart.getId()); 		
		}
		
		return null;		
	}
	
	public static void main(String[] args) {
		CartDao cartDao = new CartDaoImpl(Cart.class);
				
		Dao<Product, Long> productDao = new JpaGenericDao<Product, Long>(Product.class);
		UserDao userDao = new UserDaoImpl(User.class);
		
		User user = userDao.findById(7L);
		
		CartService service = new CartService();
		
		service.createCartForUser(user);

		//Cart cart = cartDao.findById(1L);		
		
		//Product product1 = productDao.findById(3L);
		//Product product2 = productDao.findById(2L);
		
		//System.out.println(product1);
		
		//service.addProductToCart(product1, cart);
		//service.addProductToCart(product2, cart);
	}
	

}
