/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.AdvancePayment;
import entity.Bonus;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class BonusDAO extends EntityDAO<Bonus, String> {

    @Override
    public void insert(Bonus b) {
        String sql = "INSERT INTO [dbo].[Bonus]\n"
                + "           ([Amount]\n"
                + "           ,[Desc]\n"
                + "           ,[Date]\n"
                + "           ,[EmpID])\n"
                + "     VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, b.getAmount(), 
                b.getDesc(), 
                b.getBonusDate(), 
                b.getEmployee().getId());
    }

    @Override
    public void update(Bonus b) {
        String sql = "UPDATE Bonus SET Amount = ?, [Desc] = ?, Date = ?, EmpID = ? WHERE SEQ = ?";
        XJdbc.update(sql, b.getAmount(), 
                b.getDesc(), 
                b.getBonusDate(), 
                b.getEmployee().getId(), 
                b.getSeq());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM Bonus WHERE SEQ = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public List<Bonus> selectAll() {
        String sql = "select * from Bonus";
        return selectBySql(sql);
    }

    @Override
    public Bonus selectByID(String id) {
        String sql = "select * from Bonus where SEQ = ?";
        List<Bonus> list = selectBySql(sql, id);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }
    
     
    public Bonus selectByEmpID(String EmpID) {
        String sql = "select * from Bonus where EmpID = ?";
        List<Bonus> list = selectBySql(sql, EmpID);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Bonus> selectBySql(String sql, Object... args) {
        List<Bonus> list = new ArrayList();
        EmployeeDAO dao = new EmployeeDAO();

        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Bonus bonus = new Bonus();
                    bonus.setSeq(rs.getInt("SEQ"));
                    bonus.setAmount(rs.getDouble("Amount"));
                    bonus.setDesc(rs.getString("Desc"));
                    bonus.setBonusDate(rs.getDate("Date"));
                    bonus.setEmployee(dao.selectByID(rs.getString("EmpID")));
                    list.add(bonus);
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
