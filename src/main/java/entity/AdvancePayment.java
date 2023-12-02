/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Fixluck
 */
public class AdvancePayment {
    private int id;
    private double advAmount;
    private Date dateAdv;
    private Employee employee;

    public AdvancePayment() {
    }

    public AdvancePayment(int id, double advAmount, Date dateAdv, Employee employee) {
        this.id = id;
        this.advAmount = advAmount;
        this.dateAdv = dateAdv;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAdvAmount() {
        return advAmount;
    }

    public void setAdvAmount(double advAmount) {
        this.advAmount = advAmount;
    }

    public Date getDateAdv() {
        return dateAdv;
    }

    public void setDateAdv(Date dateAdv) {
        this.dateAdv = dateAdv;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
}
