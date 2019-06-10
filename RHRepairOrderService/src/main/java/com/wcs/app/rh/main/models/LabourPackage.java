package com.wcs.app.rh.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_LabourPackage", catalog = "republic_hyundai")
public class LabourPackage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pkg_name;
	public LabourPackage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LabourPackage(int id, String pkg_name) {
		super();
		this.id = id;
		this.pkg_name = pkg_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPkg_name() {
		return pkg_name;
	}
	public void setPkg_name(String pkg_name) {
		this.pkg_name = pkg_name;
	}
	
}
