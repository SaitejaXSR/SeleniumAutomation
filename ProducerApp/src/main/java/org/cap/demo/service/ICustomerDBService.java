package org.cap.demo.service;

import java.util.List;

import org.cap.demo.model.Customer;

public interface ICustomerDBService {

	public List<Customer> getAllCustomers();

	public Customer findCustomer(Integer custId);

	public List<Customer> deleteCustomer(Integer custId);

	public Customer addCustomer(Customer customer);

	public Customer editCustomer(Customer customer);

	public Customer updateCutomerEmailAndLastName(Integer custId, String emailId, String lastName);
	
	public Customer findByEmailId(String emailId);
	
	public List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
	
	public List<Customer> findCustomerNames(String fname);
	
	public List<String> getAllFirstName();
	
	public List<Customer> getAllNames();
}
