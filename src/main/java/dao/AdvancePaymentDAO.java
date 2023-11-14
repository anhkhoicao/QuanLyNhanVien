/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.AdvancePayment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class AdvancePaymentDAO extends EntityDAO<AdvancePayment, String> {

    @Override
    public void insert(AdvancePayment adv) {
        String sql = "INSERT INTO [dbo].[AdvancePayment]\n"
                + "           ([Amount]\n"
                + "           ,[AdvDate]\n"
                + "           ,[EmpID])\n"
                + "     VALUES (?, ?, ?)";
        
        XJdbc.update(sql, adv.getAdvAmount(), 
                adv.getDateAdv(), 
                adv.getEmployee().getId());
    }

    @Override
    public void update(AdvancePayment adv) {
        String sql = "UPDATE AdvancePayment SET Amount = ?, AdvDate = ?, EmpID = ? where SEQ = ?";
        XJdbc.update(sql, adv.getAdvAmount(), 
                adv.getDateAdv(), 
                adv.getEmployee().getId(), 
                adv.getId());
    }

    @Override
    public void delete(String id) {
        String sql = "delete from AdvancePayment where SEQ = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public List<AdvancePayment> selectAll() {
        String sql = "select * from AdvancePayment";
        return selectBySql(sql);
    }

    @Override
    public AdvancePayment selectByID(String id) {
        String sql = "select * from AdvancePayment where SEQ = ?";
        List<AdvancePayment> list = selectBySql(sql, id);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<AdvancePayment> selectBySql(String sql, Object... args) {
        List<AdvancePayment> list = new ArrayList();
        EmployeeDAO dao = new EmployeeDAO();

        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    AdvancePayment adv = new AdvancePayment();
                    adv.setId(rs.getInt("SEQ"));
                    adv.setAdvAmount(rs.getDouble("Amount"));
                    adv.setDateAdv(rs.getDate("AdvDate"));
                    adv.setEmployee(dao.selectByID(rs.getString("EmpID")));
                    list.add(adv);
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
//        AdvancePaymentDAO dao = new AdvancePaymentDAO();
//        AdvancePayment adv = dao.selectByID("5");
//        System.out.println(adv.getEmployee().getFirstName());
//    }
}
