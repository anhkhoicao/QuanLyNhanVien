/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author Fixluck
 */
public class Employee {
    private String EmpID;
    private String name;
    private String sex;
    private String phoneNumber;
    private String email;
    private String password;
    private String role;
    private double salary;
    private Department department;
    private Position position;

    public Employee() {
    }

    public Employee(String EmpID, String name, String sex, String phoneNumber, String email, String password, String role, double salary, Department department, Position position) {
        this.EmpID = EmpID;
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.role = role;
        this.salary = salary;
        this.department = department;
        this.position = position;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    private AdvancePayment monthlyAdvPayment;

    public Employee(String EmpID, String name, String sex, String phoneNumber, String email, String password, String role, double salary, Department department, Position position, AdvancePayment monthlyAdvPayment) {
        this.EmpID = EmpID;
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.role = role;
        this.salary = salary;
        this.department = department;
        this.position = position;
        this.monthlyAdvPayment = monthlyAdvPayment;
    }

    public AdvancePayment getMonthlyAdvPayment() {
        return monthlyAdvPayment;
    }

    public void setMonthlyAdvPayment(AdvancePayment monthlyAdvPayment) {
        this.monthlyAdvPayment = monthlyAdvPayment;
    }
    
    
    
    
    
    
          
}
