package com.bilgeadam.marathon.entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "oid")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "branch_no",referencedColumnName = "branch_number")
	private Branch branch;
	
	@Column(name = "account_number")
	private int accountNumber;
	
	@OneToOne
	@JoinColumn(name = "account_type_no",referencedColumnName = "account_no")
	private AccountType accountType;
	
	@ManyToOne
	@JoinColumn(name = "customer_no",referencedColumnName = "customer_number")
	private Customer customer;
	
	@OneToMany(mappedBy = "account")
	private Collection<Process>processList;

	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	
	
}
