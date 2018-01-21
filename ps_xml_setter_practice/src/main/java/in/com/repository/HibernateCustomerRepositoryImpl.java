package in.com.repository;

import java.util.ArrayList;
import java.util.List;

import in.com.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustormerRepository {
	
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setFirstname("priyesh");
		customer.setLastname("soni");
		customers.add(customer);
		return customers;
	}

}
