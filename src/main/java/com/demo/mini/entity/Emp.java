package com.demo.mini.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Emp_Details")
@Data
public class Emp {
	
	@Id
	@GeneratedValue
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CONTACT")
	private Long contact;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ACTIVE_SW")
	private String activeSw;
	
	@Column(name="CREATED_DATE")
	private LocalDate createdDate;
	
	@Column(name="UPDATED_DATE")
	private LocalDate updatedDate;
	

}
