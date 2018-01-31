package br.edu.uncisal.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.uncisal.shoppingcart.util.JpaUtil;

@Entity
@Table(name = "status")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private StatusType name;

	public StatusType getName() {
		return name;
	}

	public void setName(StatusType name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name.toString();
	}
	
	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		
		Status status = new Status();
		
		status.setName(StatusType.AGUARDANDO_PAGAMENTO);
		
		em.getTransaction().begin();		
		em.persist(status);		
		em.getTransaction().commit();
		
	}

}
