/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import javax.swing.JDialog;

/**
 *
 * @author caube
 */
public interface MainController {
    void initialize();
    void openJDialog(JDialog dialog);
    void exitApplication();
    void setStatus(String status);
    void startTimer();
    void logout();
    void login();
    
    void openWelcomeDialog();
    void openAdvPaymentDialog();
    void openBonusDialog();
    void openChangePasswordDialog();
    void openDepartmentDialog();
    void openEmployeeDialog();
    void openLoginDialog();
    
    
    void openAttendance();
    void openWorkDay();
    void openSalaryDetail();
    void openDepartmentReport();
    
    abstract void openGuide();
    abstract void openHelp();
}
