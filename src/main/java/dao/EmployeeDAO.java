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
 * @author caube
 */
public class EmployeeDAO extends EntityDAO<Employee, String> {

    @Override
    public void insert(Employee e) {
        String sql = "INSERT INTO [dbo].[Employee]\n"
                + "           ([Id]\n"
                + "           ,[FirstName]\n"
                + "           ,[LastName]\n"
                + "           ,[Sex]\n"
                + "           ,[PhoneNumber]\n"
                + "           ,[Email]\n"
                + "           ,[Password]\n"
                + "           ,[Role]\n"
                + "           ,[BaseSalary]\n"
                + "           ,[DepID]\n"
                + "           ,[PosID]\n"
                + "           ,[Images])\n"
                + "     VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, e.getId(),
                e.getFirstName(),
                e.getLastName(),
                e.getSex(),
                e.getPhoneNumber(),
                e.getEmail(),
                e.getPassword(),
                e.getRole(),
                e.getBaseSalary(),
                e.getDepartment().getDepID(),
                e.getPosition().getPosID(),
                e.getImage());
    }

    @Override
    public void update(Employee e) {
        String sql = "UPDATE Employee SET FirstName = ?, "
                + "LastName = ?, "
                + "Sex = ?, "
                + "PhoneNumber = ?, "
                + "Email = ?, "
                + "Password = ?, "
                + "Role = ?, "
                + "BaseSalary = ?, "
                + "DepID = ?, "
                + "PosID = ?, "
                + "Images = ?"
                + " WHERE Id = ?";

        XJdbc.update(sql, e.getFirstName(),
                e.getLastName(),
                e.getSex(),
                e.getPhoneNumber(),
                e.getEmail(),
                e.getPassword(),
                e.getRole(),
                e.getBaseSalary(),
                e.getDepartment().getDepID(),
                e.getPosition().getPosID(),
                e.getImage(),
                e.getId());
    }

    @Override
    public void delete(String empID) {
        String sql = "delete from Employee where ID = ?";
        XJdbc.update(sql, empID);
    }

    @Override
    public List<Employee> selectAll() {
        String sql = "select * from Employee";
        return selectBySql(sql);
    }

    @Override
    public Employee selectByID(String empId) {
        String sql = "select * from Employee where Id = ?";
        List<Employee> list = selectBySql(sql, empId);
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
                    emp.setId(rs.getString("Id"));
                    emp.setFirstName(rs.getString("FirstName"));
                    emp.setLastName(rs.getString("LastName"));
                    emp.setSex(rs.getString("Sex"));
                    emp.setPhoneNumber(rs.getString("PhoneNumber"));
                    emp.setEmail(rs.getString("Email"));
                    emp.setPassword(rs.getString("Password"));
                    emp.setRole(rs.getString("Role"));
                    emp.setBaseSalary(rs.getDouble("BaseSalary"));
                    emp.setDepartment(depDAO.selectByID(rs.getString("DepID")));
                    emp.setPosition(posDAO.selectByID(rs.getString("PosID")));
                    emp.setImage(rs.getString("Images"));
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

    public List<Employee> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM Employee WHERE 1 = 1 AND (FirstName LIKE ? OR LastName LIKE ? OR Id LIKE ? OR Sex LIKE ? OR Role LIKE ? OR BaseSalary LIKE ? OR DepID LIKE ? OR PosID LIKE ?)";
        String formattedKeyword = "%" + keyword + "%";

        return selectBySql(sql, formattedKeyword, formattedKeyword, formattedKeyword, keyword + "%", formattedKeyword, formattedKeyword, keyword + "%", formattedKeyword);
    }

    public void updatePassword(Employee e) {
        String sql = "UPDATE Employee SET Password = ? WHERE Id = ?";
        XJdbc.update(sql, e.getPassword(), e.getId());
    }


    Employee getById(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }
    public String getIDByName(String name) {
        String sql = "select ID from Position where ID = ?";
         String id = null;
        try {
            ResultSet rs = XJdbc.query(sql, name);
            if (rs.next()) {
                id = rs.getString("ID");
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return id;

    }
}

