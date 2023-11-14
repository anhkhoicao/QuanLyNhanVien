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
public class TimeSheet {
    private int seq;
    private Date date;
    private boolean status;
    private Employee empID;
    private Employee managerID;

    public TimeSheet() {
    }

    public TimeSheet(int seq, Date date, boolean status, Employee empID, Employee managerID) {
        this.seq = seq;
        this.date = date;
        this.status = status;
        this.empID = empID;
        this.managerID = managerID;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Employee getEmpID() {
        return empID;
    }

    public void setEmpID(Employee empID) {
        this.empID = empID;
    }

    public Employee getManagerID() {
        return managerID;
    }

    public void setManagerID(Employee managerID) {
        this.managerID = managerID;
    }
    
    
}
