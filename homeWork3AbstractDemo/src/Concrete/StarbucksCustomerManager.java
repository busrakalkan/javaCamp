package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerChenkService;
	
	public StarbucksCustomerManager(CustomerCheckService customerChenkService) {
		super();
		this.customerChenkService = customerChenkService;
	}

	@Override
	public void save(Customer customer) {
		if(customerChenkService.checkIfRealPerson(customer)){
			super.save(customer);
		}
		else {
			System.out.println("Geçerli bir kiþi deðil");
		}
	}

}
