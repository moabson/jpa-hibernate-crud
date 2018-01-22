package br.edu.uncisal.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acess_levels")
public class AcessLevel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private AcessLevelType name;

	public AcessLevelType getName() {
		return name;
	}

	public void setName(AcessLevelType name) {
		this.name = name;
	}

}
