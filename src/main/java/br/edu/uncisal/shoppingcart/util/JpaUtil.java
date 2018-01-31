package br.edu.uncisal.shoppingcart.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager = null;
	
	public static EntityManager getEntityManager() {

		if (entityManager == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("testePU");
			entityManager = Persistence.createEntityManagerFactory("testePU").createEntityManager();
		}
		
		return entityManager;
		
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

}
