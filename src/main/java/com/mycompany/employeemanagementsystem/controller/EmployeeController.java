package com.mycompany.employeemanagementsystem.controller;


import com.mycompany.employeemanagementsystem.entity.Employee;
import com.mycompany.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;
import java.util.Optional;
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/employee")
    public Iterable<Employee> read(){
        return employeeService.findAll();
    }

    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable Integer id){
       employeeService.deleteById(id);
    }

    @GetMapping("/wrong")
    public Employee somethingWentWrong(){
        throw new ValidationException("Something went wrong");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    String exceptionHandler(ValidationException e){
        return e.getMessage();
    }
}
