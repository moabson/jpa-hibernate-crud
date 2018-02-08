package br.edu.uncisal.jpahibernatecrud.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SALARIED_EMPLOYEE")
public class SalariedEmployee extends Employee {

	private static final long serialVersionUID = 1262492535316565391L;
	
	private Double bruteSalary;

	public Double getBruteSalary() {
		return bruteSalary;
	}

	public void setBruteSalary(Double bruteSalary) {
		this.bruteSalary = bruteSalary;
	}	
	
}
