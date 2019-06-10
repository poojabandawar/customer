package com.wcs.app.rh.main.serviceinterface;

import java.util.List;
import java.util.Optional;

import com.wcs.app.rh.main.models.District;
import com.wcs.app.rh.main.models.States;
import com.wcs.app.rh.main.models.VehicleModel;
import com.wcs.app.rh.main.models.VehicleType;

public interface ServiceInterface {
	
	public List<District> findAllByState_id(int id);
	public District findDistById(int id);
	public States findStateById(int id);
	public List<States> findAllStates();

	public VehicleModel findModelById(int id);
	
	public List<VehicleModel> findAllByVehicleModel();

	public Optional<VehicleType> findVehicleTypeById(int id);
	

}
