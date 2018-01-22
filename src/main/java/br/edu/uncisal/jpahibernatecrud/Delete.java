package br.edu.uncisal.jpahibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.uncisal.shoppingcart.model.User;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePU");
		EntityManager em = emf.createEntityManager();
		
		Long id = 2L;

		User u = em.find(User.class, id);

		if (u != null) {
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();
		} else {
			System.out.println("Não foi possível localizar o usuário de id = " + id + ".");			
		}	

	}

}
