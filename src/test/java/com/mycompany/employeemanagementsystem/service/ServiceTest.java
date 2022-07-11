package com.mycompany.employeemanagementsystem.service;


import com.mycompany.employeemanagementsystem.entity.Employee;
import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    public void testCreateReadDelete(){
        Employee employee = new Employee("Aayush Vyas", "7903642389",
                "Madhya pradesh", "IT", "Associate",
                "rst@gmail.com", false);

        employeeService.save(employee);
        Iterable<Employee> employees = employeeService.findAll();
        Assertions.assertThat(employees).extracting(Employee::getEmpName).containsOnly("Aayush Vyas");

        employeeService.deleteAll();
        Assertions.assertThat(employeeService.findAll()).isEmpty();

    }
}
