//package com.wcs.app.rh.main.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.wcs.app.rh.main.models.CustomerDetails;
//import com.wcs.app.rh.main.models.District;
//import com.wcs.app.rh.main.models.States;
//import com.wcs.app.rh.main.models.VehicleModel;
//import com.wcs.app.rh.main.models.VehicleType;
//import com.wcs.app.rh.main.serviceimpl.ServiceImplementation;
//
//@RestController
//@CrossOrigin("*")
//public class AccountController
//{
//	@Autowired
//	ServiceImplementation serviceImpl;
//	@RequestMapping(value="/addcustdetails", consumes= "application/json",method=RequestMethod.POST)
//	public String addCustomer(@RequestBody CustomerDetails customerDetails)
//	{
//		System.out.println("In Account");
//		
//		System.out.println("Name : " + customerDetails.getFirst_name());
//			
//		return "Saved";
//	}
//
//	@GetMapping(value="/getStates", produces = "application/json")
//	@ResponseBody
//	@CrossOrigin("*")
//	public String getAllStates() throws JsonProcessingException
//	{
//		System.out.println("In getStates");
//		List<States>  statelist=serviceImpl.findAllStates();
//		ObjectMapper objmap=new ObjectMapper();
//		String json=objmap.writeValueAsString(statelist);
//		return json;
//	}
//	
//	@GetMapping(value="/getCities", produces = "application/json")
//	@ResponseBody
//	@CrossOrigin("*")
//	public String getDistrict(@RequestParam int id) throws JsonProcessingException
//	{
//		
//		System.out.println(id);
//		List<District>  dlist=serviceImpl.findAllByState(id);
//		ObjectMapper objmap= new ObjectMapper();
//		String json=objmap.writeValueAsString(dlist);
//		return json;
//	}
//
//	
//	
//	@GetMapping(value="/getvehicleModel", produces = "application/json")
//	@ResponseBody
//	@CrossOrigin("*")
//	public String getAllVehicleModel(@RequestParam int id) throws JsonProcessingException
//	{
//		System.out.println("In getvehiclemodel");
//		List<VehicleModel>  modellist=serviceImpl.findAllByVehicleModel();
//		ObjectMapper objmap=new ObjectMapper();
//		String json=objmap.writeValueAsString( modellist);
//		return json;
//	}
//	
//	
//	
//	
//
//	/*
//	 * @GetMapping(value="/getvehicletype", produces = "application/json")
//	 * 
//	 * @ResponseBody
//	 * 
//	 * @CrossOrigin("*") public String getvehicletype(@RequestParam int id) throws
//	 * JsonProcessingException {
//	 * 
//	 * System.out.println(id); List<VehicleType>
//	 * vehicletype=serviceImpl.findAllByVehicleModel(id); ObjectMapper objmap= new
//	 * ObjectMapper(); String json=objmap.writeValueAsString( vehicletype); return
//	 * json; }
//	 */
//	
//}



package com.wcs.app.rh.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wcs.app.rh.main.models.CustomerDetails;
import com.wcs.app.rh.main.models.District;
import com.wcs.app.rh.main.models.States;
import com.wcs.app.rh.main.models.VehicleModel;
import com.wcs.app.rh.main.models.VehicleType;
import com.wcs.app.rh.main.serviceimpl.ServiceImplementation;

@RestController
@CrossOrigin("*")
public class AccountController
{
	@Autowired
	ServiceImplementation serviceImpl;
	@CrossOrigin("*")
	@RequestMapping(value="/addcustdetails",method=RequestMethod.POST)
	public String addCustomer(@RequestBody CustomerDetails customerDetails )
	{
		
		System.out.println("In Account with cust details");
		System.out.println("Name : " + customerDetails.getFirst_name());
		System.out.println("Dist " + customerDetails.getDistrict());
		System.out.println("State " + customerDetails.getState());
			
		return "Saved";
	}

	
	@GetMapping(value="/getStates", produces = "application/json")
	@ResponseBody
	@CrossOrigin("*")
	public String getAllStates() throws JsonProcessingException
	{
		System.out.println("In Account to get states list");
		List<States>  statelist=serviceImpl.findAllStates();
		ObjectMapper objmap=new ObjectMapper();
		String json=objmap.writeValueAsString(statelist);
		return json;
	}
	@GetMapping(value="/getCities", produces = "application/json")
	@ResponseBody
	@CrossOrigin("*")
	public String getDistrict(@RequestParam int id) throws JsonProcessingException
	{
		System.out.println("In Account with state id for get dist " + id);
		
		List<District>  dlist=serviceImpl.findAllByState_id(id);
		ObjectMapper objmap= new ObjectMapper();
		String json=objmap.writeValueAsString(dlist);
		return json;
	}

	@GetMapping(value="/getVehiclemodel", produces = "application/json")
	@ResponseBody
	@CrossOrigin("*")
	public String getAllVehicleModel() throws JsonProcessingException
	{
		System.out.println("In Account to get model list");
		List<VehicleModel>  modellist=serviceImpl.findAllByVehicleModel();
		ObjectMapper objmap=new ObjectMapper();
		String json=objmap.writeValueAsString(modellist);
		return json;
	}
	
	
	@GetMapping(value="/getvehicletype", produces = "application/json")
	@ResponseBody
	@CrossOrigin("*")
	public String getVehicleType(@RequestParam int id) throws JsonProcessingException
	{
		System.out.println("In Account with model id for get type " + id);
		
		List<VehicleType>  typelist=serviceImpl.findAllByVehicleModel(id);
		ObjectMapper objmap= new ObjectMapper();
		String json=objmap.writeValueAsString( typelist);
		return json;
	}

	
	
}

