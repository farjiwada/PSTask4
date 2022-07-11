package com.mycompany.employeemanagementsystem;

import com.mycompany.employeemanagementsystem.controller.EmployeeController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmsApplicationTests {

	@Autowired
	EmployeeController employeeController;

	@Test
	void contextLoads() {
		Assert.assertNotNull(employeeController);
//		Assert.assertNotNull(loginControler);
	}

}
