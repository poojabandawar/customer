package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "rh_InvoiceMaster", catalog = "republic_hyundai")
public class InvoiceMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String invioce_no;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerProduct customerProduct;
	@OneToOne(cascade = CascadeType.ALL)
	private SystemUsers createdBy;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	public InvoiceMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvoiceMaster(int id, String invioce_no, CustomerProduct customerProduct, SystemUsers createdBy,
			Status status) {
		super();
		this.id = id;
		this.invioce_no = invioce_no;
		this.customerProduct = customerProduct;
		this.createdBy = createdBy;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInvioce_no() {
		return invioce_no;
	}
	public void setInvioce_no(String invioce_no) {
		this.invioce_no = invioce_no;
	}
	public CustomerProduct getCustomerProduct() {
		return customerProduct;
	}
	public void setCustomerProduct(CustomerProduct customerProduct) {
		this.customerProduct = customerProduct;
	}
	public SystemUsers getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(SystemUsers createdBy) {
		this.createdBy = createdBy;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
