package org.cap.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.cap.demo.dao.IAccountDBDao;
import org.cap.demo.dao.ICustomerDBDao;
import org.cap.demo.model.Account;
import org.cap.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("customerDBService")
public class CustomerServiceImpl implements ICustomerDBService{
	
	@Autowired
	private ICustomerDBDao customerDbDao;
	
	@Autowired
	private IAccountDBDao accountDBDao;

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDbDao.findAll();
	}

	@Override
	public Customer findCustomer(Integer custId) {
		Optional<Customer> optional= customerDbDao.findById(custId);
		if(optional.isEmpty())
			return null;
		return optional.get();
	}

	@Override
	public List<Customer> deleteCustomer(Integer custId) {
		customerDbDao.deleteById(custId);
		return getAllCustomers();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		customerDbDao.save(customer);
		
		for(Account account:customer.getAccounts()) {
			account.setCustomer(customer);
			accountDBDao.save(account);
		}
		
		return customer;
	}

	@Override
	public Customer editCustomer(Customer customer) {
		
		return addCustomer(customer);
	}

	
	@Transactional
	@Override
	public Customer updateCutomerEmailAndLastName(Integer custId, String emailId, String lastName) {
		Customer customer= findCustomer(custId);
		customer.setEmailId(emailId);
		customer.setLastName(lastName);
		return customer;
	}

	@Override
	public Customer findByEmailId(String emailId) {
		
		return customerDbDao.findByEmailId(emailId);
	}

	@Override
	public List<Customer> findByFirstNameAndLastName(String firstName, String lastName) {
		
		return customerDbDao.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public List<Customer> findCustomerNames(String fname) {
		
		return customerDbDao.findCustomerNames(fname);
	}

	@Override
	public List<String> getAllFirstName() {
		// TODO Auto-generated method stub
		return customerDbDao.getAllFirstName();
	}

	@Override
	public List<Customer> getAllNames() {
		// TODO Auto-generated method stub
		return customerDbDao.getAllNames();
	}

	
	
}
