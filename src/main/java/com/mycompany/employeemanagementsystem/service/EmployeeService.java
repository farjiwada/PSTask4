package com.mycompany.employeemanagementsystem.service;

import com.mycompany.employeemanagementsystem.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeService extends CrudRepository<Employee, Integer> {
}
