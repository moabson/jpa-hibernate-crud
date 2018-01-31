package br.edu.uncisal.shoppingcart.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.uncisal.shoppingcart.dao.CartDao;
import br.edu.uncisal.shoppingcart.model.Cart;
import br.edu.uncisal.shoppingcart.model.Product;

public class CartDaoImpl extends JpaGenericDao<Cart, Long> implements CartDao {

	public CartDaoImpl(Class<Cart> classe) {
		super(classe);
	}

	public List<Product> findAllProducts(Long cartId) {	
		Cart cart = findById(cartId);
		
		if (cart != null) {
			return new ArrayList<Product>(cart.getProducts());
		}
				
		return null;		
	}
	
	
	
}
