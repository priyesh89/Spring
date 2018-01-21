package in.com.service;

import in.com.model.Customer;
import in.com.repository.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	//or
	/*@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter injection");
		this.customerRepository = customerRepository;
	}
	*/
	//or
//	@Autowired
//	public CustomerServiceImpl(CustomerRepository customerRepository){
//		System.out.println("constructor injection");
//		this.customerRepository=customerRepository;
//	}
	
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}


}
