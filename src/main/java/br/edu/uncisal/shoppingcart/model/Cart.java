package br.edu.uncisal.shoppingcart.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.uncisal.shoppingcart.util.JpaUtil;

@Entity
@Table(name = "carts")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "total")
	private BigDecimal total;
	
	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;

	
	@ManyToMany
	@JoinTable(
				name = "cart_product",
				joinColumns = @JoinColumn(name = "cart_id"),
				inverseJoinColumns = @JoinColumn(name = "product_id")
			)
	private List<Product> products;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}

	@Override
	public String toString() {
		return String.format("[%d %s %d %s]", this.id, this.user, this.total, this.status);
	}
	
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.getEntityManager();
	
		
		Product product = em.find(Product.class, 2L);
		
		Cart cart = em.find(Cart.class, 1L);
		
		cart.products.add(product);
		
		
		em.getTransaction().begin();
		//em.persist(cart);
		em.getTransaction().commit();
		
		
		System.out.println(cart.products.size());
		
		
	}
	
	
}
