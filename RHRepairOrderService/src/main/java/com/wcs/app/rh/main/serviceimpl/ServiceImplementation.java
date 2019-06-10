package com.wcs.app.rh.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.rh.main.models.District;
import com.wcs.app.rh.main.models.States;
import com.wcs.app.rh.main.models.VehicleModel;
import com.wcs.app.rh.main.models.VehicleType;
import com.wcs.app.rh.main.repository.CustomerLabourRepo;
import com.wcs.app.rh.main.repository.CustomerRepo;
import com.wcs.app.rh.main.repository.CustomerServiceDetailsRepo;
import com.wcs.app.rh.main.repository.CustomerVehicleRepo;
import com.wcs.app.rh.main.repository.DistrictRepo;
import com.wcs.app.rh.main.repository.GatePassRepo;
import com.wcs.app.rh.main.repository.InvoiceMasterRepo;
import com.wcs.app.rh.main.repository.LabourPackageRepo;
import com.wcs.app.rh.main.repository.ProductsRepo;
import com.wcs.app.rh.main.repository.ROInvoiceRepo;
import com.wcs.app.rh.main.repository.RoleRepo;
import com.wcs.app.rh.main.repository.ServicePackagesRepo;
import com.wcs.app.rh.main.repository.StatesRepository;
import com.wcs.app.rh.main.repository.StatusRepo;
import com.wcs.app.rh.main.repository.SystemUsersRepo;
import com.wcs.app.rh.main.repository.TaxTypeRepo;
import com.wcs.app.rh.main.repository.VehicleModelRepo;
import com.wcs.app.rh.main.repository.VehicleTypeRepo;
import com.wcs.app.rh.main.serviceinterface.ServiceInterface;


@Service
public class ServiceImplementation implements ServiceInterface {

	@Autowired
	private StatesRepository statesRepository;
	@Autowired
	private CustomerLabourRepo customerLabourRepo;
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private CustomerServiceDetailsRepo customerServiceDetailsRepo;
	@Autowired
	private CustomerVehicleRepo customerVehicleRepo;
	@Autowired
	private DistrictRepo districtRepo;
	@Autowired
	private GatePassRepo gatePassRepo;
	@Autowired
	private InvoiceMasterRepo invoiceMasterRepo;
	@Autowired
	private LabourPackageRepo labourPackageRepo;
	@Autowired
	private ProductsRepo productsRepo;
	@Autowired
	private ROInvoiceRepo roInvoiceRepo;
	@Autowired
	private RoleRepo roleRepo;
	@Autowired
	private ServicePackagesRepo servicePackagesRepo;
	@Autowired
	private StatusRepo statusRepo;
	@Autowired
	private SystemUsersRepo systemUsersRepo;
	@Autowired
	private TaxTypeRepo taxTypeRepo;
	@Autowired
	private VehicleModelRepo vehicleModelRepo;
	@Autowired
	private VehicleTypeRepo vehicleTypeRepo;
	@Override
	public List<District> findAllByState_id(int id) {
		// TODO Auto-generated method stub
		return districtRepo.findAllByState_id(id);
	}
	@Override
	public District findDistById(int id) {
		// TODO Auto-generated method stub
		return districtRepo.findById(id);
	}
	@Override
	public States findStateById(int id) {
		// TODO Auto-generated method stub
		return statesRepository.findById(id);
	}
	@Override
	public List<States> findAllStates() {
		// TODO Auto-generated method stub
		return (List<States>) statesRepository.findAll();
	}

	@Override
	public VehicleModel findModelById(int id) {
		// TODO Auto-generated method stub
		return vehicleModelRepo.findAllById(id);
	}
	@Override
	public List<VehicleModel> findAllByVehicleModel() {
		// TODO Auto-generated method stub
		return (List<VehicleModel>) vehicleModelRepo.findAll();
	}
	@Override
	public Optional<VehicleType> findVehicleTypeById(int id) {
		// TODO Auto-generated method stub
		return vehicleTypeRepo.findById(id);
	}
	
	
	  public List<VehicleType> findAllByVehicleModel(int id) {
		  
		  return (List<VehicleType>) vehicleTypeRepo.findAllByVehicleModel(id);
	  
	  }
	 
}
