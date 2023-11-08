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
public class EmployeeDAO extends EntityDAO<Employee, String> {

    @Override
    public void insert(Employee emp) {
        String sql = """
                     INSERT INTO [dbo].[Employee]
                                ([EmpID]
                                ,[Name]
                                ,[Sexual]
                                ,[PhoneNumber]
                                ,[Email]
                                ,[Password]
                                ,[Role]
                                ,[Salary]
                                ,[DepID]
                                ,[PosID])
                          VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)""";
        
        XJdbc.update(sql, emp.getEmail(), 
                emp.getName(), 
                emp.getSex(), 
                emp.getPhoneNumber(), 
                emp.getEmail(), 
                emp.getPassword(), 
                emp.getRole(), 
                emp.getSalary(), 
                emp.getDepartment().getDepID(), 
                emp.getPosition().getPosID());
    }

    @Override
    public void update(Employee emp) {
        String sql = "";
    }

    @Override
    public void delete(String empID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Employee> selectAll() {
        String sql = "select * from Employee";
        return selectBySql(sql);
    }

    @Override
    public Employee selectByID(String empID) {
        String sql = "select * from Employee where EmpID = ? ";
        List<Employee> list = selectBySql(sql, empID);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Employee> selectBySql(String sql, Object... args) {
        List<Employee> list = new ArrayList();
        DepartmentDAO depDAO = new DepartmentDAO();
        PositionDAO posDAO = new PositionDAO();

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
                    emp.setDepartment(depDAO.selectByID(rs.getString("DepID")));
                    emp.setPosition(posDAO.selectByID(rs.getString("PosID")));
                    list.add(emp);

                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
//    public static void main(String[] args) {
//        EmployeeDAO dao = new EmployeeDAO();
//        List<Employee> list = dao.selectAll();
//        System.out.println(list.get(0).getName());
//    }

}
