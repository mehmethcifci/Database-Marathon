package com.bilgeadam.marathon.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="process_detail")
public class ProcessDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "oid")
	private long id;
	@Column(name = "process_description")
	private String processDescription;
	private int status;
	@Column(name = "process_date")
	private LocalDate processDate;
	
	@OneToOne 
	@JoinColumn(name = "process_no",referencedColumnName = "process_id")
	private Process process;

	public ProcessDetail(String processDescription, int status, LocalDate processDate) {
		this.processDescription = processDescription;
		this.status = status;
		this.processDate = processDate;
		
	}
	
	
}
