package org.cap.demo.controller;

import java.util.List;

import org.cap.demo.dao.ICustomerDao;
import org.cap.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/api/v1")
public class CustomerRestController {
	
	@Autowired
	private ICustomerDao customerDao;
	
	@PatchMapping("/customers/{custId}/{emailId}/{lastName}")
	public ResponseEntity<Customer> updateEmailAndlastName(
			@PathVariable("custId")Integer custId,
			@PathVariable("emailId")String emailId,
			@PathVariable("lastName")String lastName){
		
		Customer customer= customerDao.updateCutomerEmailAndLastName(custId,emailId,lastName);
		
		if(customer==null)
			return new ResponseEntity("Updation Error!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	

	@PutMapping("/customers")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		Customer customer2= customerDao.editCustomer(customer);
		
		if(customer2==null)
			return new ResponseEntity("Updation Error!", HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Customer>(customer2, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		
		Customer customer2= customerDao.addCustomer(customer);
		
		if(customer2==null)
			return new ResponseEntity("Insertion Error!", HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Customer>(customer2, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@DeleteMapping("/customers/{custId}")
	public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable("custId")Integer custId  ){
		List<Customer> customers=customerDao.deleteCustomer(custId);
		
		if(customers==null)
			return new ResponseEntity("Deletion error! No custId found!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	@ApiOperation(nickname = "findCustomer",notes = "Search Customer Details",value = "searchCustomer")
	@ApiResponses (value = {@ApiResponse(code = 500, message = "Server Not Availale")})
	@GetMapping(value = "/customers/{custId}",produces = {"application/xml","application/json"})
			//produces = {MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Customer> findCustomer(
			@ApiParam(value = "customerId",required = true,defaultValue = "1")
			@PathVariable("custId")Integer custId
			
			){
		Customer customer= customerDao.findCustomer(custId);
		
		if(customer==null)
			return new ResponseEntity("No customer with this id:!" + custId, HttpStatus.NOT_FOUND );
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
	
	@GetMapping(value = "/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> customers= customerDao.getAllCustomers();
		
		if(customers.isEmpty())
			return new ResponseEntity("No customer details Available!", HttpStatus.NOT_FOUND );
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	
}
