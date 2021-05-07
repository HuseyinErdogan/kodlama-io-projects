package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to database: "+customer.getFirstName());
	}

}
