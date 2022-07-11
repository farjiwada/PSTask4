package com.mycompany.employeemanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;

    private String empName;

    private String empContact;

    private String empAddress;

    private  String empDepartment;

    private String empRole;

    private String empEmail;

    private Boolean empAccess;

    public Employee() {
    }

    public Employee(String empName, String empContact, String empAddress, String empDepartment, String empRole, String empEmail, Boolean empAccess) {
        this.empName = empName;
        this.empContact = empContact;
        this.empAddress = empAddress;
        this.empDepartment = empDepartment;
        this.empRole = empRole;
        this.empEmail = empEmail;
        this.empAccess = empAccess;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpContact() {
        return empContact;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Boolean getEmpAccess() {
        return empAccess;
    }

    public void setEmpAccess(Boolean empAccess) {
        this.empAccess = empAccess;
    }
}