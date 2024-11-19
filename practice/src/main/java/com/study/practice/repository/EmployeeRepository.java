package com.study.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.practice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
