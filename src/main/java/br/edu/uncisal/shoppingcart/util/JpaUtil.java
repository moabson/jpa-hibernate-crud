package br.edu.uncisal.shoppingcart.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JpaUtil {
	
	public static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("testePU").createEntityManager();
	}

}
