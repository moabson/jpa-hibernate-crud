package br.edu.uncisal.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.uncisal.shoppingcart.util.JpaUtil;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "acess_level_id")
	private AcessLevel acessLevel;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public AcessLevel getAcessLevel() {
		return acessLevel;
	}

	public void setAcessLevel(AcessLevel acessLevel) {
		this.acessLevel = acessLevel;
	}

	@Override
	public String toString() {
		return String.format("[%d %s %s %s %s]", this.id, this.username, this.password, this.name, this.email);
	}
	
	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		
		User u = new User();
		u.setName("Sicrano da Silva");
		u.setUsername("sicrano");
		u.setPassword("123");
		u.setEmail("sicrano.silva@gmail.com");
		
		u.setAcessLevel(em.find(AcessLevel.class, 2L));
		
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();		
	}
	
}
