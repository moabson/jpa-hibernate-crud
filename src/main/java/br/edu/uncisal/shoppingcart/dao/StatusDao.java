package br.edu.uncisal.shoppingcart.dao;

import br.edu.uncisal.shoppingcart.model.Status;
import br.edu.uncisal.shoppingcart.model.StatusType;

public interface StatusDao extends Dao<Status, Long> {

	public Status findByName(StatusType status);
	
}
