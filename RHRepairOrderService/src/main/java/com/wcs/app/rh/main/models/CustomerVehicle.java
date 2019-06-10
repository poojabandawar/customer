package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_customer_vehicle", catalog = "republic_hyundai")
public class CustomerVehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vehicle_engine_no;
	private String vehicle_chassis_no;
	private String vehicle_rto_no;
	private String vehicle_fuel_type;
	private String km_reading;
	private String vehicle_color;
	private String reg_date;
	@OneToOne(cascade = CascadeType.ALL)
	private VehicleModel vehicle;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails customerDetails;
	public CustomerVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerVehicle(int id, String vehicle_engine_no, String vehicle_chassis_no, String vehicle_rto_no,
			String vehicle_fuel_type, String km_reading, String vehicle_color, String reg_date, VehicleModel vehicle,
			CustomerDetails customerDetails) {
		super();
		this.id = id;
		this.vehicle_engine_no = vehicle_engine_no;
		this.vehicle_chassis_no = vehicle_chassis_no;
		this.vehicle_rto_no = vehicle_rto_no;
		this.vehicle_fuel_type = vehicle_fuel_type;
		this.km_reading = km_reading;
		this.vehicle_color = vehicle_color;
		this.reg_date = reg_date;
		this.vehicle = vehicle;
		this.customerDetails = customerDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicle_engine_no() {
		return vehicle_engine_no;
	}
	public void setVehicle_engine_no(String vehicle_engine_no) {
		this.vehicle_engine_no = vehicle_engine_no;
	}
	public String getVehicle_chassis_no() {
		return vehicle_chassis_no;
	}
	public void setVehicle_chassis_no(String vehicle_chassis_no) {
		this.vehicle_chassis_no = vehicle_chassis_no;
	}
	public String getVehicle_rto_no() {
		return vehicle_rto_no;
	}
	public void setVehicle_rto_no(String vehicle_rto_no) {
		this.vehicle_rto_no = vehicle_rto_no;
	}
	public String getVehicle_fuel_type() {
		return vehicle_fuel_type;
	}
	public void setVehicle_fuel_type(String vehicle_fuel_type) {
		this.vehicle_fuel_type = vehicle_fuel_type;
	}
	public String getKm_reading() {
		return km_reading;
	}
	public void setKm_reading(String km_reading) {
		this.km_reading = km_reading;
	}
	public String getVehicle_color() {
		return vehicle_color;
	}
	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public VehicleModel getVehicle() {
		return vehicle;
	}
	public void setVehicle(VehicleModel vehicle) {
		this.vehicle = vehicle;
	}
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	
}
