package org.cap.demo.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@SequenceGenerator(initialValue = 12345,name = "accseq",sequenceName = "accseq")
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "accseq")
	private int accountId;
	private String accountType;
	private LocalDate openingDate=LocalDate.now();
	private double balance;
	
	//to avoid circular dependency
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "customer_fk")
	private Customer customer;
	
	public Account(int accountId, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	public Account(String accountType, LocalDate openingDate, double balance) {
		super();
		this.accountType = accountType;
		this.openingDate = openingDate;
		this.balance = balance;
	}
	public Account(int accountId, String accountType, LocalDate openingDate, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.openingDate = openingDate;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public LocalDate getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
