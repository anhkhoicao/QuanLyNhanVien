/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Report1.Attendance;
import entity.Report1.ReportOnDepartment;
import entity.Report1.SalaryDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class Report1DAOImpl implements Report1DAO {

    String salaryDetailCall = "{call sp_CalSalaryDetail (?, ?)}";
    String workDayCall = "{call sp_WorkDayCount (?, ?)}";
    String departmentCall = "{call sp_GetDepartmentReport}";

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

    @Override
    public List<SalaryDetail> getSalaryDetail(int month, int year) {
        List<SalaryDetail> list = new ArrayList<>();
        EmployeeDAO dao = new EmployeeDAO();
        try {
            ResultSet rs = XJdbc.callProc(salaryDetailCall, month, year);
            while (rs.next()) {
                SalaryDetail sd = new SalaryDetail();
                sd.setEmployee(dao.selectByID(rs.getString("ID")));
                sd.setAp(rs.getDouble("AdvPayment"));
                sd.setBonus(rs.getDouble("Bonus"));
                sd.setNoDayAttendance(rs.getInt("NoDayAttendance"));
                sd.setWorkDayInMonth(rs.getInt("WorkDayInMonth"));
                sd.setTotalSalary(rs.getDouble("TotalSalary"));
                list.add(sd);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    @Override
    public List<ReportOnDepartment> getReportOnDepartment() {
        List<ReportOnDepartment> list = new ArrayList();
        try {
            ResultSet rs = XJdbc.callProc(departmentCall);
            while (rs.next()) {                
                ReportOnDepartment rp = new ReportOnDepartment();
                rp.setDepartmentName(rs.getString("DepName"));
                rp.setNoEmp(rs.getInt("NoEmp"));
                rp.setTotalSalary(rs.getDouble("TotalSalary"));
                rp.setHighestSalary(rs.getDouble("HighestSalary"));
                rp.setLowestSalary(rs.getDouble("LowestSalary"));
                rp.setAvgSalary(rs.getDouble("AvgSalary"));
                list.add(rp);
            }
        } catch (SQLException e) {
            System.out.println(e);
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

}
