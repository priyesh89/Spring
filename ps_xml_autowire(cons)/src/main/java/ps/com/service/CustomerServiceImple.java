package ps.com.service;

import java.util.List;

import ps.com.model.Customer;
import ps.com.repository.CustomerRepository;

public class CustomerServiceImple implements CustomerService {
	private CustomerRepository customerRepository;
	
	public CustomerServiceImple(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
