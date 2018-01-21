package ps.com.repository;

import java.util.ArrayList;
import java.util.List;

import ps.com.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("priyesh");
		customer.setLastName("soni");
		customers.add(customer);
		return customers;
	}
}
