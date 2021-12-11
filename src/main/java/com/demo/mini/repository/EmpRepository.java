package com.demo.mini.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mini.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Serializable> {

}
