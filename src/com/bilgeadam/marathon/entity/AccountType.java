package com.bilgeadam.marathon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="account_type")
public class AccountType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_type_id")
	private long id;
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "account_no")
	private int accountNo;
	
	@OneToOne(mappedBy = "accountType")
	private Account bank;

	public AccountType(String accountType, int accountNo) {
		this.accountType = accountType;
		this.accountNo = accountNo;
		
	}
	
	
	
	
}
