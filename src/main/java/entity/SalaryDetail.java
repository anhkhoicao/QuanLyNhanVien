/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Fixluck
 */
public class SalaryDetail {
    private int id;
    private Date dateCreated;
    private double totalSalary;
    private Employee employee;

    public SalaryDetail() {
    }

    public SalaryDetail(int id, Date dateCreated, double totalSalary, Employee employee) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.totalSalary = totalSalary;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getTotalSalary() {
        
        double baseSalary = employee.getSalary();
        double allowance = employee.getPosition().getAllowance();
        
        AdvancePayment monthlyAdvPayment = employee.getMonthlyAdvPayment();
        
        double advAmount = (monthlyAdvPayment != null) ? monthlyAdvPayment.getAdvAmount() : 0;
        
        totalSalary = baseSalary + allowance - advAmount;
        
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
   
    
    
}
