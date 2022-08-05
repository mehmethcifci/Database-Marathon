package com.bilgeadam.marathon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Process {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "process_id")
	private long id;
	@Column(name = "process_no")
	private String processNo;
	@ManyToOne
	@JoinColumn(name = "account_number",referencedColumnName ="account_number")
	private Account account;
	
	
	@OneToOne(mappedBy = "process")
	private ProcessDetail processDetail;


	public Process(String processNo) {
		this.processNo = processNo;
		
	}



	
	
}
