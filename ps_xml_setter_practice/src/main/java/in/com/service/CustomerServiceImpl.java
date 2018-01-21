package in.com.service;

import java.util.List;

import in.com.model.Customer;
import in.com.repository.CustormerRepository;

public class CustomerServiceImpl implements CustomerService{
	
	private CustormerRepository custormerRepository;

	public void setCustormerRepository(CustormerRepository custormerRepository) {
		this.custormerRepository = custormerRepository;
	}
	
	public List<Customer> findAll(){
		return custormerRepository.findAll();
	}
	

}
