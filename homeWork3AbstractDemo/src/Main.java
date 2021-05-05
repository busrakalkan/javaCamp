import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Adapter.MernisServiceAdapter;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Büþra");
		customer.setLastName("Kalkan");
		customer.setDateOfBirth(LocalDate.of(1997,05,19));
		customer.setNationalityId("123456789");
		
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		try {
			customerManager.save(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
