/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.SalaryDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class SalaryDetailDAO extends EntityDAO<SalaryDetail, String> {

    @Override
    public void insert(SalaryDetail sd) {
        String sql = "INSERT INTO [dbo].[SalaryDetail]\n"
                + "           ([DateCreate]\n"
                + "           ,[TotalSalary]\n"
                + "           ,[EmpID])\n"
                + "     VALUES (?, ?, ?)";
        
        XJdbc.update(sql, sd.getDateCreated(), 
                sd.getTotalSalary(), 
                sd.getEmployee());
        
        
    }

    @Override
    public void update(SalaryDetail entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SalaryDetail> selectAll() {
        String sql = "select * from SalaryDetail";
        return selectBySql(sql);
    }

    @Override
    public SalaryDetail selectByID(String id) {
         String sql = "select * from AdvancePayment where ID = ? ";
        List<SalaryDetail> list = selectBySql(sql, id);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<SalaryDetail> selectBySql(String sql, Object... args) {
        List<SalaryDetail> list = new ArrayList();
        EmployeeDAO empDAO = new EmployeeDAO();
        

        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    SalaryDetail sd = new SalaryDetail();
                    sd.setId(rs.getInt("ID"));
                    sd.setDateCreated(rs.getDate("DateCreate"));
                    sd.setTotalSalary(rs.getDouble("TotalSalary"));
                    sd.setEmployee(empDAO.selectByID(rs.getString("EmpID")));
                    list.add(sd);

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
