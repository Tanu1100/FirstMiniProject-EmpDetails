package com.demo.mini.service;

import java.util.List;

import com.demo.mini.binding.EmpBinding;

public interface EmpServiceI {
	
	public String saveRecords(EmpBinding bind);
	
	public List<EmpBinding>viewAllRecords();
	
	public EmpBinding editRecord(Integer empId);
	
	public List<EmpBinding>deleteRecord(Integer empId);

}
