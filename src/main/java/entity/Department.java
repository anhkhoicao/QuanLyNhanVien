/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Fixluck
 */
public class Department {
    private String depID;
    private String depName;

    public Department() {
    }

    public Department(String depID, String depName) {
        this.depID = depID;
        this.depName = depName;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return depName;
    }
    
    
    
}
