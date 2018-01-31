package br.edu.uncisal.shoppingcart.dao;

import java.util.List;

import br.edu.uncisal.shoppingcart.model.Cart;
import br.edu.uncisal.shoppingcart.model.Product;

public interface CartDao extends Dao<Cart, Long>  {
	public List<Product> findAllProducts(Long cartId);
}
