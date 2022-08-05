package com.bilgeadam.marathon.entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private long id;
	@Column(name="customer_number")
	private String customerNumber;
	
	@Column(name = "full_name")
	private String fullName;
	@OneToMany(mappedBy = "customer")
	private Collection<Account> accountList;
	
	
	public Customer(String customerNumber, String fullName) {
		this.customerNumber = customerNumber;
		this.fullName = fullName;
		
	}
	
	
	
	
}
