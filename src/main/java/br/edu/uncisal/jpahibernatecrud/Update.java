package br.edu.uncisal.jpahibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.uncisal.shoppingcart.model.User;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePU");
		EntityManager em = emf.createEntityManager();

		User u = em.find(User.class, 1L);

		u.setName("Test Update");

		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
	}

}
