/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author caube
 */
public class Bonus {
    private int seq;
    private double amount;
    private String desc;
    private Date advDate;
    private Employee employee;

    public Bonus() {
    }

    public Bonus(int seq, double amount, String desc, Date advDate, Employee employee) {
        this.seq = seq;
        this.amount = amount;
        this.desc = desc;
        this.advDate = advDate;
        this.employee = employee;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getAdvDate() {
        return advDate;
    }

    public void setAdvDate(Date advDate) {
        this.advDate = advDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
