package com.wcs.app.rh.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.rh.main.models.VehicleType;

public interface VehicleTypeRepo extends CrudRepository<VehicleType, Integer>{

	
	public VehicleType findAllByVehicleModel(int id);
	
}
