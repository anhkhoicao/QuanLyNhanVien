/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.TimeSheet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.XDate;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class TimeSheetDAO extends EntityDAO<TimeSheet, String> {

    @Override
    public void insert(TimeSheet t) {
        String sql = "INSERT INTO [dbo].[TimeSheet]\n"
                + "           ([Date]\n"
                + "           ,[Status]\n"
                + "           ,[EmpID]\n"
                + "           ,[ManagerID])\n"
                + "     VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, t.getDate(), 
                t.isStatus(), 
                t.getEmp().getId(), 
                t.getManager().getId());
    }

    @Override
    public void update(TimeSheet t) {
        String sql = "UPDATE TimeSheet SET Date = ?, Status = ?, EmpID = ?, ManagerID = ? WHERE SEQ = ?";
        XJdbc.update(sql, t.getDate(), 
                t.isStatus(), 
                t.getEmp().getId(), 
                t.getManager().getId(), 
                t.getSeq());
        
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM TimeSheet WHERE SEQ = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public List<TimeSheet> selectAll() {
        String sql = "select * from TimeSheet";
        return selectBySql(sql);
    }

    @Override
    public TimeSheet selectByID(String id) {
        String sql = "select * from TimeSheet where SEQ = ?";
        List<TimeSheet> list = selectBySql(sql, id);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<TimeSheet> selectBySql(String sql, Object... args) {
        List<TimeSheet> list = new ArrayList();
        EmployeeDAO dao = new EmployeeDAO();

        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    TimeSheet t = new TimeSheet();
                    t.setSeq(rs.getInt("SEQ"));
                    t.setDate(rs.getDate("Date"));
                    t.setStatus(rs.getBoolean("Status"));
                    t.setEmp(dao.selectByID(rs.getString("EmpID")));
                    t.setManager(dao.selectByID(rs.getString("ManagerID")));
                    list.add(t);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
     public boolean existsEmployee(String empID, Date date) {
        String sql = "SELECT COUNT(*) FROM TimeSheet WHERE EmpID = ? AND Date = ?";
        Integer value =(Integer) XJdbc.value(sql, empID, date);
        return value >= 1;
    }
    
    public static void main(String[] args) {
        TimeSheetDAO dao = new TimeSheetDAO();
        boolean value = dao.existsEmployee("E005", XDate.toDate("2023-11-20", "yyyy-MM-dd"));
        System.out.println(value);
                
    }

}
