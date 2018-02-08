package br.edu.uncisal.jpahibernatecrud;

import javax.persistence.EntityManager;

import br.edu.uncisal.jpahibernatecrud.model.SalariedEmployee;
import br.edu.uncisal.shoppingcart.util.JpaUtil;

public class Main {
	
	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		
		
		SalariedEmployee employee1 = new SalariedEmployee();
		
		employee1.setName("Teste");
		employee1.setBruteSalary(1300.00);
		
		
		em.getTransaction().begin();
		em.persist(employee1);
		em.getTransaction().commit();
		
		
		
	}

}
