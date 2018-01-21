package ps.com.service;

import java.util.List;

import ps.com.model.Customer;
import ps.com.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
