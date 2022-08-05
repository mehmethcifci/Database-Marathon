package com.bilgeadam.marathon.entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "oid")
	private long id;
	@Column(name = "branch_number")
	private String branchNo;
	@Column(name = "branch_city")
	private String branchCity;
	
	@OneToMany (mappedBy = "branch")
	private Collection<Account>accountList;

	public Branch(String branchNo, String branchCity) {
		this.branchNo = branchNo;
		this.branchCity = branchCity;
		
	}
	
	
}
