package com.wcs.app.rh.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wcs.app.rh.main.models.District;
import com.wcs.app.rh.main.models.States;

public interface DistrictRepo extends CrudRepository<District, Integer>{

//	@Query("FROM District where state=?50")
	public List<District> findAllByState_id(int id);
	public District findById(int id);
	
}
