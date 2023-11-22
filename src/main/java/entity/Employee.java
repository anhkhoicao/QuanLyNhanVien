/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Fixluck
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Employee {
    private String Id;
    private String firstName;
    private String lastName;
    private String sex;
    private String phoneNumber;
    private String email;
    private String password;
    private String role;
    private double baseSalary;
    private Department department;
    private Position position;
    private String image;        
}
