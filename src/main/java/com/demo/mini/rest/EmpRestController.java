package com.demo.mini.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mini.binding.EmpBinding;
import com.demo.mini.service.EmpServiceI;


@RestController
public class EmpRestController {

	@Autowired
	EmpServiceI serv;

	@GetMapping("/get")
	public List<EmpBinding> getAllRecords() {

		return serv.viewAllRecords();

	}

	@PostMapping("/save")
	public String saveRecords(@RequestBody EmpBinding bind) {
		String save = serv.saveRecords(bind);

		return save;

	}

	@GetMapping("/edit/{EmpId}")
	public EmpBinding editRecords(@PathVariable Integer EmpId) {
		return serv.editRecord(EmpId);
	}

	@DeleteMapping("/del/{EmpId}")
	public List<EmpBinding> DeleteData(@PathVariable Integer EmpId) {
		return serv.deleteRecord(EmpId);

	}

	

}
