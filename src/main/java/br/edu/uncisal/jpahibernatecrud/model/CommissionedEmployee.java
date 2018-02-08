package br.edu.uncisal.jpahibernatecrud.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("COMMISSIONED_EMPLOYEE")
public class CommissionedEmployee extends Employee {

	private static final long serialVersionUID = 2425906183314951899L;
	
	private Double commissionPercentage;

	public Double getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(Double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

}
