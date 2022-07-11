package com.mycompany.employeemanagementsystem.controllers;


import com.mycompany.employeemanagementsystem.controller.EmployeeController;
import com.mycompany.employeemanagementsystem.entity.Employee;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.validation.ValidationException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTest {

    @Autowired
    EmployeeController employeeController;

    @Test
    public void testCreateReadDelete(){
        Employee employee = new Employee("Aayush Vyas", "7903642389", "Madhya pradesh", "IT", "Associate", "rst@gmail.com", false);
        Employee employeeResult = employeeController.create(employee);
        Iterable<Employee> employees = employeeController.read();
        Assertions.assertThat(employees).first().hasFieldOrPropertyWithValue("empName", "Aayush Vyas");
        employeeController.delete(employeeResult.getEmpID());
        Assertions.assertThat(employeeController.read()).isEmpty();
    }

    @Test(expected = ValidationException.class)
    public void errorHandlingValidationExceptionThrown(){
        employeeController.somethingWentWrong();
    }

}
