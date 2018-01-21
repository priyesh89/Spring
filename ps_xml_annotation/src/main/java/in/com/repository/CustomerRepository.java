package in.com.repository;

import in.com.model.Customer;

import java.util.List;

public interface CustomerRepository {

	List<Customer> findAll();

}