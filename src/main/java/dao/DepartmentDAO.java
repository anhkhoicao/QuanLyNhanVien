/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class DepartmentDAO extends EntityDAO<Department, String> {

    @Override
    public void insert(Department dep) {
        String sql = "INSERT INTO [dbo].[Department]\n"
                + "           ([ID]\n"
                + "           ,[DepName])\n"
                + "     VALUES (?, ?)";

        XJdbc.update(sql, dep.getDepID(),
                dep.getDepName());
    }

    @Override
    public void update(Department dep) {
        String sql = "UPDATE Department set DepName = ? where ID = ?";
        
        XJdbc.update(sql, dep.getDepName(), 
                dep.getDepID());
        
        
    }

    @Override
    public void delete(String depID) {
        String sql = "delete from Department where ID = ?";
        XJdbc.update(sql, depID);
    }

    @Override
    public List<Department> selectAll() {
        String sql = "select * from Department";
        return selectBySql(sql);
    }

    @Override
    public Department selectByID(String depID) {
        String sql = "select * from Department where ID = ? ";
        List<Department> list = selectBySql(sql, depID);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Department> selectBySql(String sql, Object... args) {
        List<Department> list = new ArrayList();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Department dep = new Department();
                    dep.setDepID(rs.getString("ID"));
                    dep.setDepName(rs.getString("DepName"));
                    list.add(dep);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    
    public List<String> getDepName() {
        String sql = "select distinct DepName from Department";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {                
                list.add(rs.getString("DepName"));
            }
            rs.getStatement().getConnection().close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
        public int getTotalEmployees(String depID) {
    String sql = "SELECT COUNT(*) AS TotalEmployees FROM Employee WHERE DepID = ?";
    try {
        ResultSet rs = XJdbc.query(sql, depID);
        if (rs.next()) {
            return rs.getInt("TotalEmployees");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
    }
    
    //hàm test để xem thử có kết nối đc với DB hay ko, vui lòng ko chỉnh sửa!!!!
//    public static void main(String[] args) {
//        DepartmentDAO dao = new DepartmentDAO();
//        Department dep = dao.selectByID("D002");
//        System.out.println(dep.getDepName());
//    }
}
