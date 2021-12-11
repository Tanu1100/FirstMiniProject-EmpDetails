package com.demo.mini.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mini.binding.EmpBinding;
import com.demo.mini.entity.Emp;
import com.demo.mini.repository.EmpRepository;
import com.demo.mini.service.EmpServiceI;

@Service
public class EmpImp implements EmpServiceI {

	@Autowired
	EmpRepository repo;

	@Override
	public String saveRecords(EmpBinding bind) {
		// TODO Auto-generated method stub

		Emp entity = new Emp();
		// EmpBinding form= new EmpBinding();
		BeanUtils.copyProperties(bind, entity);

		entity.setActiveSw("Y");

		entity = repo.save(entity);
		System.out.println(entity);
		if (entity.getEmpId() != null) {

			return "Record Save";
		}

		return "Failuer";
	}

	@Override
	public List<EmpBinding> viewAllRecords() {
		// TODO Auto-generated method stub

		List<Emp> findAllRecords = repo.findAll();
		List<EmpBinding> ListRecords = new ArrayList<>();

		for (Emp Records : findAllRecords) {
			EmpBinding form = new EmpBinding();
			BeanUtils.copyProperties(Records, form);

			ListRecords.add(form);
		}

		return ListRecords;
	}

	@Override
	public EmpBinding editRecord(Integer empId) {
		// TODO Auto-generated method stub

		Optional<Emp> findId = repo.findById(empId);

		if (findId.isPresent()) {
			EmpBinding form = new EmpBinding();
			Emp entity = findId.get();
			BeanUtils.copyProperties(entity, form);

			return form;

		}

		return null;
	}

	@Override
	public List<EmpBinding> deleteRecord(Integer empId) {
		// TODO Auto-generated method stub

		repo.deleteById(empId);

		List<EmpBinding> ListData = new ArrayList<>();
		List<Emp> findRecord = repo.findAll();
		for (Emp find : findRecord) {
			EmpBinding form = new EmpBinding();
			BeanUtils.copyProperties(find, form);
			ListData.add(form);
		}

		return ListData;
	}

}
