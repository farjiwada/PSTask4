package com.mycompany.employeemanagementsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "SALARY")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int salID;
    String salMonth;
    String salDate;
    String salAmount;

    public Salary() {
    }

    public Salary(String salMonth, String salDate, String salAmount) {
        this.salMonth = salMonth;
        this.salDate = salDate;
        this.salAmount = salAmount;
    }

    public int getSalID() {
        return salID;
    }

    public void setSalID(int salID) {
        this.salID = salID;
    }

    public String getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(String salMonth) {
        this.salMonth = salMonth;
    }

    public String getSalDate() {
        return salDate;
    }

    public void setSalDate(String salDate) {
        this.salDate = salDate;
    }

    public String getSalAmount() {
        return salAmount;
    }

    public void setSalAmount(String salAmount) {
        this.salAmount = salAmount;
    }
}
