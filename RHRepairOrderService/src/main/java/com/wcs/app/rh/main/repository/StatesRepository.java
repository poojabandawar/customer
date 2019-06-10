package com.wcs.app.rh.main.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.rh.main.models.District;
import com.wcs.app.rh.main.models.States;
public interface StatesRepository extends CrudRepository<States, Integer>

{
	public States findById(int id);
	
	
	

}
