/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author caube
 */
public class Bonus {

    private int seq;
    private double amount;
    private String desc;
    private Date bonusDate;
    private Employee employee;
   

    public Bonus() {
    }

    public Bonus(int seq, double amount, String desc, Date bonusDate, Employee employee) {
        this.seq = seq;
        this.amount = amount;
        this.desc = desc;
        this.bonusDate = bonusDate;
        this.employee = employee;

    }

    public void someMethod() {
        Employee employee = new Employee();
        String employeeId = employee.getId();
        
        // Sử dụng giá trị employeeId theo nhu cầu của bạn...
    }
    // Các phương thức khác của lớp Bonus...

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

    public Date getBonusDate() {
        return bonusDate;
    }

    public void setBonusDate(Date bonusDate) {
        this.bonusDate = bonusDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
