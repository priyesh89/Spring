package ps.com.repository;

import java.util.List;

import ps.com.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();
}
