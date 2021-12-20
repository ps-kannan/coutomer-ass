package com.onetomanyexp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.entity.Coustomer;

@Entity
@Table(name = "cous_det")
public class Company {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "cname")
	private String companyName;

	@Column(name = "contact_no")
	private String contactNo;

	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	List<Amount> listAmount;

	@ManyToOne(optional = false)
	@JoinColumn(name = "cous_id")
	private Coustomer coustomer;
	
	

	public Coustomer getCoustomer() {
		return coustomer;
	}

	public void setCoustomer(Coustomer coustomer) {
		this.coustomer = coustomer;
	}

	public List<Amount> getListAmount() {
		return listAmount;
	}

	public void setListAmount(List<Amount> listAmount) {
		this.listAmount = listAmount;
	}

	public int getCid() {
		return id;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCoustomerName() {
		return coustomerName;
	}

	public void setCoustomerName(String CoustomerName) {
		this.coustomerName = coustomerName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
