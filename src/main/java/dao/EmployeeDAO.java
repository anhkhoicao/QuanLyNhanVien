/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author Fixluck
 */
public class EmployeeDAO extends EntityDAO<Employee, String>{

    @Override
    public void insert(Employee entity) {
        
    }

    @Override
    public void update(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Employee> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Employee selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Employee> selectBySql(String sql, Object...args) {
         List<Employee> list = new ArrayList();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Employee emp = new Employee();
                    emp.setEmpID(rs.getString("EmpID"));
                    emp.setName(rs.getString("Name"));
                    emp.setSex(rs.getString("Sexual"));
                    emp.setPhoneNumber(rs.getString("PhoneNumber"));
                    emp.setEmail(rs.getString("Email"));
                    emp.setPassword(rs.getString("Password"));
                    emp.setRole(rs.getString("Role"));
                    emp.setSalary(rs.getDouble("Salary"));
                    
                    
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    
}
