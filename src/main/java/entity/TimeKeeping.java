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
public class TimeKeeping {
    private int id;
    private Date dateRoll;
    private Employee employee;

    public TimeKeeping() {
    }

    public TimeKeeping(int id, Date dateRoll, Employee employee) {
        this.id = id;
        this.dateRoll = dateRoll;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateRoll() {
        return dateRoll;
    }

    public void setDateRoll(Date dateRoll) {
        this.dateRoll = dateRoll;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
