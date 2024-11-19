package com.study.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.practice.model.Employee;
import com.study.practice.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping() 
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(this.employeeService.SaveEmployee(employee), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<>(this.employeeService.getAllEmployee(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable long id) {
		return new ResponseEntity<>(this.employeeService.getEmployee(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> DeleteEmployee(@PathVariable long id) {
		this.employeeService.deleteEmployee(id);
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}
	
	@GetMapping("/asc")
	public ResponseEntity<List<Employee>> getAscEmployees() {
		return new ResponseEntity<>(this.employeeService.getAllEmployeeAsc(), HttpStatus.OK);
	}
	
}
