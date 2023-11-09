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
public class AdvPaymentDAO extends EntityDAO<AdvancePayment, String> {

    @Override
    public void insert(AdvancePayment ap) {
        String sql = "INSERT INTO [dbo].[AdvancePayment]\n"
                + "           ([AdvAmount]\n"
                + "           ,[AdvDate]\n"
                + "           ,[EmpID])\n"
                + "     VALUES (?, ?, ?)";
        
        XJdbc.update(sql, ap.getAdvAmount(), 
                ap.getDateAdv(), 
                ap.getEmployee().getEmpID());
    }

    @Override
    public void update(AdvancePayment ap) {// update theo key id tự tăng, ko phải theo EmpID
        String sql = "UPDATE AdvancePayment SET AdvAmount = ?, AdvDate = ?, EmpID = ? WHERE ID = ?";
        XJdbc.update(sql, ap.getAdvAmount(), 
                ap.getDateAdv(), 
                ap.getEmployee().getEmpID(), 
                ap.getId());
    }

    @Override
    public void delete(String id) {// delete theo key id tự tăng, ko phải theo EmpID
        String sql = "DELETE FROM AdvancePayment WHERE ID = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public List<AdvancePayment> selectAll() {
        String sql = "select * from AdvancePayment";
        return selectBySql(sql);
    }

    @Override
    public AdvancePayment selectByID(String empID) {
        String sql = "select * from AdvancePayment where EmpID = ? ";
        List<AdvancePayment> list = selectBySql(sql, empID);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<AdvancePayment> selectBySql(String sql, Object...args) {
        List<AdvancePayment> list = new ArrayList();
        EmployeeDAO empDAO = new EmployeeDAO();

        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    AdvancePayment ap = new AdvancePayment();
                    ap.setId(rs.getInt("ID"));
                    ap.setAdvAmount(rs.getDouble("AdvAmount"));
                    ap.setDateAdv(rs.getDate("AdvDate"));
                    ap.setEmployee(empDAO.selectByID("EmpID"));
                    list.add(ap);

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
