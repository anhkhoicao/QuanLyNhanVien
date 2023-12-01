/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;


import entity.Report1.Attendance;
import entity.Report1.ReportOnDepartment;
import entity.Report1.SalaryDetail;
import java.util.List;

/**
 *
 * @author caube
 */
public interface Report1DAO {
    List<Attendance> getAttendance(int month, int year);
    List<SalaryDetail> getSalaryDetail(int month, int year);
    List<ReportOnDepartment> getReportOnDepartment();
}
