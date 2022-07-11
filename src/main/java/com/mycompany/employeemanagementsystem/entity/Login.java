package com.mycompany.employeemanagementsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "LOGIN")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int loginID;
    String loginUsername; //Name@empID
    String loginPassword;
    String loginStatus;

    public Login() {
    }

    public Login(String loginUsername, String loginPassword, String loginStatus) {
        this.loginUsername = loginUsername;
        this.loginPassword = loginPassword;
        this.loginStatus = loginStatus;
    }

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }
}
