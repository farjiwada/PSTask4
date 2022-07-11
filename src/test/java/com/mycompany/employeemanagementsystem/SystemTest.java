package com.mycompany.employeemanagementsystem;

import com.mycompany.employeemanagementsystem.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.assertj.core.api.Assertions;

public class SystemTest {

    @Test
    public void testCreateReadDelete(){

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/employee";

        Employee employee = new Employee("Aayush Vyas",
                "7903642389", "Madhya pradesh",
                "IT", "Associate", "rst@gmail.com", false);
        ResponseEntity<Employee> entity = restTemplate.postForEntity(url, employee, Employee.class);

        Employee[] employees = restTemplate.getForObject(url, Employee[].class);
        Assertions.assertThat(employees).extracting(Employee::getEmpName)
                .containsOnly("Aayush Vyas");

        restTemplate.delete(url+"/"+entity.getBody().getEmpID());
        Assertions.assertThat(restTemplate.getForObject(url, Employee[].class)).isEmpty();
    }

    @Test
    public void testErrorHandlingReturnsBadRequest() {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/wrong";

        try {
            restTemplate.getForObject(url, String.class);
        }catch (HttpClientErrorException e){
            Assert.assertEquals(HttpStatus.BAD_REQUEST, e.getStatusCode());
        }
    }
}
