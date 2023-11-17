/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entity.Report;
import java.util.List;

/**
 *
 * @author caube
 */
public interface ReportDAO {
    List<Report.SalaryDetail> getSalaryDetail(int month, int year);
    List<Report.Attendance> getAttendance(int month, int year);
}
