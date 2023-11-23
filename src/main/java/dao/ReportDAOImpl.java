/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Report;
import entity.Report.Attendance;
import entity.Report.SalaryDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class ReportDAOImpl implements ReportDAO{
    
    String salaryDetailCall = "{call sp_SalaryDetail (?, ?)}";
    String workDayCall = "{call sp_WorkDayCount (?, ?)}";

    @Override
    public List<SalaryDetail> getSalaryDetail(int month, int year) {
        List<SalaryDetail> list = new ArrayList<>();
        EmployeeDAO dao = new EmployeeDAO();
        try {
            ResultSet rs = XJdbc.callProc(salaryDetailCall, month, year);
            while (rs.next()) {                
                SalaryDetail s = new Report.SalaryDetail();
                s.setEmployee(dao.selectByID(rs.getString("ID")));
                s.setAdvPayment(rs.getDouble("AdvPayment"));
                s.setBonus(rs.getDouble("Bonus"));
                s.setTotalSalary(rs.getDouble("TotalSalary"));
                list.add(s);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    @Override
    public List<Attendance> getAttendance(int month, int year) {
        List<Attendance> list = new ArrayList<>();
        EmployeeDAO dao = new EmployeeDAO();
        try {
            ResultSet rs = XJdbc.callProc(workDayCall, month, year);
            while (rs.next()) {                
                Attendance a = new Attendance();
                a.setEmployee(dao.selectByID(rs.getString("ID")));
                a.setWorkDay(rs.getInt("Workday"));
                list.add(a);
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return list;
    }
    
    public List<Integer> selectYear() {
        String sql = "select distinct YEAR(Date) as [Year] from TimeSheet";
        List<Integer> list = new ArrayList();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {                
                list.add(rs.getInt("Year"));
            }
            rs.getStatement().getConnection().close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static void main(String[] args) {
        ReportDAOImpl dao = new ReportDAOImpl();
        List<Integer> list = dao.selectYear();
        for (Integer integer : list) {
            System.out.println(integer + "\n");
        }
    }
          
    
}
