package br.edu.uncisal.jpahibernatecrud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.uncisal.shoppingcart.model.User;

public class Read {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePU");
		EntityManager em = emf.createEntityManager();

		{
			User u = em.find(User.class, 1L);

			System.out.println(u);
		}

		System.out.println("---------------------");

		{
			// query using JPQL - Java Persistence Query Language
			// NamedQuery (static query) and DynamicQuery

			List<User> users = em.createQuery("from User", User.class).getResultList();
		
			for (User u : users) {
				System.out.println(u);
			}
		}

	}

}
