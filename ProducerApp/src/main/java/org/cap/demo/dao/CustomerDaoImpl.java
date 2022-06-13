package org.cap.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

import org.cap.demo.model.Account;
import org.cap.demo.model.Customer;
import org.springframework.stereotype.Repository;


@Repository("customerDao")
public class CustomerDaoImpl implements ICustomerDao {

	private static AtomicInteger customerId=new AtomicInteger(1);
	private static AtomicInteger accountId=new AtomicInteger(123231);
	private static List<Customer> customers=dummyDB();
	
	
	private static  List<Customer> dummyDB(){
		 List<Customer> customers=new ArrayList<>();
		 
		 Account account=new Account(accountId.getAndIncrement(),"Savings",30000);
		 Account account1=new Account(accountId.getAndIncrement(),"Current",LocalDate.of(2021, 2, 12),24522);
		 Customer customer=new Customer(customerId.getAndIncrement(),"Tom","Jerry","tom@gmail.com","254324324");
		 customer.getAccounts().add(account);
		 customer.getAccounts().add(account1);
		 
		 
		 Account account2=new Account(accountId.getAndIncrement(),"RD",56546);
		 Account account3=new Account(accountId.getAndIncrement(),"Savings",LocalDate.of(2021, 3, 1),5677);
		 Customer customer1=new Customer(customerId.getAndIncrement(),"Kamal","Singh","Kamal@gmail.com","45435");
		 customer1.getAccounts().add(account2);
		 customer1.getAccounts().add(account3);
		 
		 
		 Account account4=new Account(accountId.getAndIncrement(),"FD",345667);
		 Account account5=new Account(accountId.getAndIncrement(),"Current",LocalDate.of(2021, 1, 1),56790);
		 Customer customer2=new Customer(customerId.getAndIncrement(),"Tim","Lee","tim@gmail.com","3123321");
		 customer2.getAccounts().add(account4);
		 customer2.getAccounts().add(account5);
		 
		 customers.add(customer2);
		 customers.add(customer1);
		 customers.add(customer);
		 
		 return customers;
	}


	@Override
	public List<Customer> getAllCustomers() {
		//System.out.println(customers);
		return customers;
	}


	@Override
	public Customer findCustomer(Integer custId) {
		for(Customer customer:customers) {
			if(custId==customer.getCustomerId())
				return customer;
		}
		return null;
	}


	@Override
	public List<Customer> deleteCustomer(Integer custId) {
		boolean flag=false;
		Iterator<Customer> iterator= customers.iterator();
		while(iterator.hasNext()) {
			Customer currrent_customer= iterator.next();
			if(currrent_customer.getCustomerId()==custId)
			{
				flag=true;
				iterator.remove();
				break;
			}
		}
		
		if(flag)
			return customers;
		else
			return null;
	}


	@Override
	public Customer addCustomer(Customer customer) {
		customer.setCustomerId(customerId.getAndIncrement());
		for(Account acc:customer.getAccounts()) {
			acc.setAccountId(accountId.getAndIncrement());
		}
		customers.add(customer);
		return customer;
	}


	@Override
	public Customer editCustomer(Customer customer) {
		boolean flag=false;
		
		ListIterator<Customer> iterator= customers.listIterator();
		while(iterator.hasNext()) {
			Customer customer2= iterator.next();
			if(customer2.getCustomerId()==customer.getCustomerId()) {
				flag=true;
				iterator.set(customer);
			}
		}
		if(flag)
			return customer;
		else
			return null;
	}


	@Override
	public Customer updateCutomerEmailAndLastName(Integer custId, String emailId, String lastName) {
		boolean flag=false;
		Customer customer2=null;
		ListIterator<Customer> iterator= customers.listIterator();
		while(iterator.hasNext()) {
			customer2= iterator.next();
			if(customer2.getCustomerId()==custId) {
				flag=true;
				customer2.setEmailId(emailId);
				customer2.setLastName(lastName);
			}
			break;
		}
		if(flag)
			return customer2;
		else
			return null;
	}
}












