package com.onetomanyexp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Amount {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int coustomerId;
	private double amount;

	@ManyToOne
	Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getCoustomerId() {
		return coustomerId;
	}

	public void setCoustomerId(int coustomerId) {
		this.coustomerId = coustomerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
