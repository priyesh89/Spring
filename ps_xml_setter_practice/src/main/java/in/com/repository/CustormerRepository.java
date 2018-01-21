package in.com.repository;

import java.util.List;

import in.com.model.Customer;

public interface CustormerRepository {

	List<Customer> findAll();
}
