package com.wcs.app.rh.main.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_vehicle_type_master", catalog = "republic_hyundai")
public class VehicleType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private VehicleModel vehicleModel;
	
	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleType(int id, VehicleModel vehicleModel) {
		super();
		this.id = id;
		this.vehicleModel = vehicleModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	

}
