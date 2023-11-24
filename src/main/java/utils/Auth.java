/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entity.Employee;

/**
 *
 * @author caube
 */
public class Auth {
    public static Employee user;
    
    public static void clear() {
        Auth.user = null;
    }
    
    public static boolean isLogin() {
        return Auth.user != null;
    }
    
    public static boolean isManager() {
        return user.getRole().equals("Manager");
    }
    
    public static boolean isAccountant() {
        return user.getRole().equals("Accountant");
    }
}
