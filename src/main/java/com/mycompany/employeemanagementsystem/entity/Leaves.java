package com.mycompany.employeemanagementsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "LEAVE")
public class Leaves {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int leaveID;
    String leaveTitle;
    String leaveApplyDate;
    String leaveStartDate;
    String leaveEndDate;
    String leaveStatus;

    public Leaves() {
    }

    public Leaves(String leaveTitle, String leaveApplyDate, String leaveStartDate, String leaveEndDate, String leaveStatus) {
        this.leaveTitle = leaveTitle;
        this.leaveApplyDate = leaveApplyDate;
        this.leaveStartDate = leaveStartDate;
        this.leaveEndDate = leaveEndDate;
        this.leaveStatus = leaveStatus;
    }



    public int getLeaveID() {
        return leaveID;
    }

    public void setLeaveID(int leaveID) {
        this.leaveID = leaveID;
    }

    public String getLeaveTitle() {
        return leaveTitle;
    }

    public void setLeaveTitle(String leaveTitle) {
        this.leaveTitle = leaveTitle;
    }

    public String getLeaveApplyDate() {
        return leaveApplyDate;
    }

    public void setLeaveApplyDate(String leaveApplyDate) {
        this.leaveApplyDate = leaveApplyDate;
    }

    public String getLeaveStartDate() {
        return leaveStartDate;
    }

    public void setLeaveStartDate(String leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    public String getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(String leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    public String getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(String leaveStatus) {
        this.leaveStatus = leaveStatus;
    }
}
