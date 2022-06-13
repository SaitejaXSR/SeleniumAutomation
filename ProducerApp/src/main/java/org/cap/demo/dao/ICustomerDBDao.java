package org.cap.demo.dao;

import java.util.List;

import org.cap.demo.model.Customer;
import org.hibernate.annotations.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("customerDbDao")
public interface ICustomerDBDao extends JpaRepository<Customer, Integer>{

	public Customer findByEmailId(String emailId);
	
	public List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("from Customer c where c.firstName=?1")
	public List<Customer> findCustomerNames(String fname);
	
	
	//@Query("from Customer c where c.firstName=?1 or c.emailId=?2")
	@Query("from Customer c where c.firstName=:fname or c.emailId=:email")
	public List<Customer> findAllCustomerDetails(@Param("email")String emailId,
			@Param("fname")String fname);
	
	
	@Query("select c.firstName from Customer c")
	public List<String> getAllFirstName();
	
	
	@Query("select new Customer(c.firstName,c.lastName) from Customer c")
	public List<Customer> getAllNames();
	
	
	
	
	
	
	
	
	
	
	
}
