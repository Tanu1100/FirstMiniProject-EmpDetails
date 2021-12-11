package com.demo.mini.binding;

import java.time.LocalDate;

import lombok.Data;
@Data
public class EmpBinding {
	private Integer empId;
	private String name;
	private Long contact;
	private String email;
	private String activeSw;
	private LocalDate createdDate;
	private LocalDate updatedDate;

}
