package org.cap.demo.controller;

import java.util.List;

import org.cap.demo.dao.ICustomerDao;
import org.cap.demo.model.Customer;
import org.cap.demo.service.ICustomerDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class CustomerDBRestController {
	
	@Autowired
	private ICustomerDBService customerDBService;
	
	@GetMapping("/allnames")
	public ResponseEntity<List<Customer>> getAllNames(){
		List<Customer> customers= customerDBService.getAllNames();
		
		if(customers==null)
			return new ResponseEntity("No Names Found!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/allfname")
	public ResponseEntity<List<String>> getAllFirstName(){
		List<String> customers= customerDBService.getAllFirstName();
		
		if(customers==null)
			return new ResponseEntity("No Names Found!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<String>>(customers, HttpStatus.OK);
	}
	
	
	@GetMapping("/findcustname/{fname}")
	public ResponseEntity<List<Customer>> findByCustomerName(
			@PathVariable("fname")String fname
			){
		List<Customer> customers= customerDBService.findCustomerNames(fname);
		
		if(customers==null)
			return new ResponseEntity("Customer Details Not Exists!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	
	@GetMapping("/findname/{fname}/{lname}")
	public ResponseEntity<List<Customer>> findByName(
			@PathVariable("fname")String fname,
			@PathVariable("lname")String lname){
		List<Customer> customers= customerDBService.findByFirstNameAndLastName(fname, lname);
		
		if(customers==null)
			return new ResponseEntity("Customer Details Not Exists!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	
	@GetMapping("/findbyemail/{email}")
	public ResponseEntity<Customer> findByEmailId(@PathVariable("email")String email){
		Customer customer= customerDBService.findByEmailId(email);
		
		if(customer==null)
			return new ResponseEntity("Customer Details Not Exists!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	//--------------------------------CRUD operations---------------------------------
	@PatchMapping("/customers/{custId}/{emailId}/{lastName}")
	public ResponseEntity<Customer> updateEmailAndlastName(
			@PathVariable("custId")Integer custId,
			@PathVariable("emailId")String emailId,
			@PathVariable("lastName")String lastName){
		
		Customer customer= customerDBService.updateCutomerEmailAndLastName(custId,emailId,lastName);
		
		if(customer==null)
			return new ResponseEntity("Updation Error!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	

	@PutMapping("/customers")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		Customer customer2= customerDBService.editCustomer(customer);
		
		if(customer2==null)
			return new ResponseEntity("Updation Error!", HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Customer>(customer2, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		
		Customer customer2= customerDBService.addCustomer(customer);
		
		if(customer2==null)
			return new ResponseEntity("Insertion Error!", HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Customer>(customer2, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@DeleteMapping("/customers/{custId}")
	public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable("custId")Integer custId  ){
		List<Customer> customers=customerDBService.deleteCustomer(custId);
		
		if(customers==null)
			return new ResponseEntity("Deletion error! No custId found!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping(value = "/customers/{custId}")
			
			//,produces = {"application/xml","application/json"})
			//produces = {MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Customer> findCustomer(@PathVariable("custId")Integer custId){
		Customer customer= customerDBService.findCustomer(custId);
		
		if(customer==null)
			return new ResponseEntity("No customer with this id:!" + custId, HttpStatus.NOT_FOUND );
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
	
	@GetMapping(value = "/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> customers= customerDBService.getAllCustomers();
		
		if(customers.isEmpty())
			return new ResponseEntity("No customer details Available!", HttpStatus.NOT_FOUND );
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	
}
