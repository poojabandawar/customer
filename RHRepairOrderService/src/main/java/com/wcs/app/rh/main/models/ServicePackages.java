package com.wcs.app.rh.main.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rh_service_packages", catalog = "republic_hyundai")
public class ServicePackages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> serviceOne;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> serviceTwo;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> serviceThree;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> paidservice;
	public ServicePackages() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServicePackages(int id, List<Products> serviceOne, List<Products> serviceTwo, List<Products> serviceThree,
			List<Products> paidservice) {
		super();
		this.id = id;
		this.serviceOne = serviceOne;
		this.serviceTwo = serviceTwo;
		this.serviceThree = serviceThree;
		this.paidservice = paidservice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Products> getServiceOne() {
		return serviceOne;
	}
	public void setServiceOne(List<Products> serviceOne) {
		this.serviceOne = serviceOne;
	}
	public List<Products> getServiceTwo() {
		return serviceTwo;
	}
	public void setServiceTwo(List<Products> serviceTwo) {
		this.serviceTwo = serviceTwo;
	}
	public List<Products> getServiceThree() {
		return serviceThree;
	}
	public void setServiceThree(List<Products> serviceThree) {
		this.serviceThree = serviceThree;
	}
	public List<Products> getPaidservice() {
		return paidservice;
	}
	public void setPaidservice(List<Products> paidservice) {
		this.paidservice = paidservice;
	}
	

}
