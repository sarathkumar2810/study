package com.study.practice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.practice.model.Employee;
import com.study.practice.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee SaveEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployee(long id) {
		return this.employeeRepository.findById(id);
		
	}

	public List<Employee> getAllEmployee() {
		return this.employeeRepository.findAll();
	}
	
	public void deleteEmployee(long id) {
		this.employeeRepository.deleteById(id);
	}

	public List<Employee> getAllEmployeeAsc() {
		return this.employeeRepository.findAll().stream().sorted().collect(Collectors.toList());
	}

}
