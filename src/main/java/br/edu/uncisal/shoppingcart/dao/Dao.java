package br.edu.uncisal.shoppingcart.dao;

import java.util.List;

public interface Dao<T, K> {

	public void save(T element);
	public void remove(K id);
	public void update(K id);
	public T findById(K id);
	public List<T> findAll();	

}
