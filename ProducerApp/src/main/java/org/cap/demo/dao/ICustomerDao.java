package org.cap.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.cap.demo.model.Customer;

public interface ICustomerDao {
	
	
	public List<Customer> getAllCustomers();

	public Customer findCustomer(Integer custId);

	public List<Customer> deleteCustomer(Integer custId);

	public Customer addCustomer(Customer customer);

	public Customer editCustomer(Customer customer);

	public Customer updateCutomerEmailAndLastName(Integer custId, String emailId, String lastName);

}
