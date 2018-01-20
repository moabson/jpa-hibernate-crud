package br.edu.uncisal.jpahibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.uncisal.jpahibernatecrud.model.User;

public class Create {
	
    public static void main(String[] args) {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePU");
    	EntityManager em = emf.createEntityManager();
    	
    	User u = new User();
    	u.setName("André Moabson");
    	u.setEmail("moabsond2@gmail.com");

    	em.getTransaction().begin();
    	em.persist(u);
    	em.getTransaction().commit();
 
    	
    }
    
}
