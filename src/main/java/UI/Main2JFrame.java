/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import controller.MainController;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.UnsupportedLookAndFeelException;
import utils.Auth;
import utils.MsgBox;
import utils.XDate;

/**
 *
 * @author caube
 */
public class Main2JFrame extends javax.swing.JFrame implements MainController {

    /**
     * Creates new form Main2JFrame
     */
    public Main2JFrame() {
        initComponents();
        initialize();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnExit = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnReportSalary = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        lblMainImage = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        mniChangePassword = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        mnuControl = new javax.swing.JMenu();
        mniEmp = new javax.swing.JMenuItem();
        mniDepartment = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        mniAdvPayment = new javax.swing.JMenuItem();
        mniBonus = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenu();
        mniWorkDay = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniSalaryDetail = new javax.swing.JMenuItem();
        mniReportDep = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mniGuide = new javax.swing.JMenuItem();
        mniHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ManangePro");
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(99, 165, 239));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-manager-24.png"))); // NOI18N
        lblStatus.setText("User:");
        lblStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel1.add(lblStatus, java.awt.BorderLayout.LINE_START);

        lblTimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-clock-24.png"))); // NOI18N
        lblTimer.setText("Timer");
        lblTimer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel1.add(lblTimer, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 406, 809, -1));

        jToolBar1.setBackground(new java.awt.Color(189, 107, 255));
        jToolBar1.setRollover(true);

        btnExit.setBackground(new java.awt.Color(189, 107, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-power-off-button-48.png"))); // NOI18N
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        btnAttendance.setBackground(new java.awt.Color(189, 107, 255));
        btnAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-attendance-48-1.png"))); // NOI18N
        btnAttendance.setFocusable(false);
        btnAttendance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAttendance.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAttendance);

        btnEmployee.setBackground(new java.awt.Color(189, 107, 255));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-manager-48.png"))); // NOI18N
        btnEmployee.setFocusable(false);
        btnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEmployee);

        btnReportSalary.setBackground(new java.awt.Color(189, 107, 255));
        btnReportSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-report-48.png"))); // NOI18N
        btnReportSalary.setFocusable(false);
        btnReportSalary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportSalary.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportSalaryActionPerformed(evt);
            }
        });
        jToolBar1.add(btnReportSalary);

        btnHelp.setBackground(new java.awt.Color(189, 107, 255));
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-help-48-1.png"))); // NOI18N
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHelp);

        jPanel2.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblMainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clip-busy-day-at-the-office.png"))); // NOI18N
        jPanel2.add(lblMainImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 380, 290));

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 163, 232));
        kGradientPanel1.setkGradientFocus(15);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 102, 255));

        jLabel1.setText("jLabel1");
        kGradientPanel1.add(jLabel1);

        jLabel2.setText("jLabel2");
        kGradientPanel1.add(jLabel2);

        jPanel2.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 830, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 460));

        mnuSystem.setText("System");

        mniLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-login-24.png"))); // NOI18N
        mniLogin.setText("Login");
        mniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoginActionPerformed(evt);
            }
        });
        mnuSystem.add(mniLogin);

        mniLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-logout-24.png"))); // NOI18N
        mniLogout.setText("Logout");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnuSystem.add(mniLogout);

        mniChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-update-24 (2).png"))); // NOI18N
        mniChangePassword.setText("ChangePassword");
        mniChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChangePasswordActionPerformed(evt);
            }
        });
        mnuSystem.add(mniChangePassword);
        mnuSystem.add(jSeparator1);

        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-exit-24 (1).png"))); // NOI18N
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuSystem.add(mniExit);

        jMenuBar1.add(mnuSystem);

        mnuControl.setText("Control");

        mniEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-user-24 (1).png"))); // NOI18N
        mniEmp.setText("Employee");
        mniEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmpActionPerformed(evt);
            }
        });
        mnuControl.add(mniEmp);

        mniDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-department-24.png"))); // NOI18N
        mniDepartment.setText("Department");
        mniDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDepartmentActionPerformed(evt);
            }
        });
        mnuControl.add(mniDepartment);
        mnuControl.add(separator);

        mniAdvPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-dollar-24.png"))); // NOI18N
        mniAdvPayment.setText("AdvPayment");
        mniAdvPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAdvPaymentActionPerformed(evt);
            }
        });
        mnuControl.add(mniAdvPayment);

        mniBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-bonus-24.png"))); // NOI18N
        mniBonus.setText("Bonus-Fine");
        mniBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBonusActionPerformed(evt);
            }
        });
        mnuControl.add(mniBonus);

        jMenuBar1.add(mnuControl);

        mnuReport.setText("Report");

        mniWorkDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-clock-24.png"))); // NOI18N
        mniWorkDay.setText("WorkDay");
        mniWorkDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniWorkDayActionPerformed(evt);
            }
        });
        mnuReport.add(mniWorkDay);
        mnuReport.add(jSeparator2);

        mniSalaryDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-file-invoice-dollar-24.png"))); // NOI18N
        mniSalaryDetail.setText("SalaryDetail");
        mniSalaryDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalaryDetailActionPerformed(evt);
            }
        });
        mnuReport.add(mniSalaryDetail);

        mniReportDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-museum-24.png"))); // NOI18N
        mniReportDep.setText("ReportDep");
        mniReportDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReportDepActionPerformed(evt);
            }
        });
        mnuReport.add(mniReportDep);

        jMenuBar1.add(mnuReport);

        mnuHelp.setText("Help");

        mniGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-analyze-24.png"))); // NOI18N
        mniGuide.setText("Introduce");
        mniGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuideActionPerformed(evt);
            }
        });
        mnuHelp.add(mniGuide);

        mniHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-help-24-3.png"))); // NOI18N
        mniHelp.setText("Help");
        mnuHelp.add(mniHelp);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoginActionPerformed
        // TODO add your handling code here:
        login();

    }//GEN-LAST:event_mniLoginActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_mniLogoutActionPerformed

    private void mniChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChangePasswordActionPerformed
        // TODO add your handling code here:
        openChangePasswordDialog();
    }//GEN-LAST:event_mniChangePasswordActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        exitApplication();
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmpActionPerformed
        // TODO add your handling code here:
//        openEmployeeDialog();
    }//GEN-LAST:event_mniEmpActionPerformed

    private void mniDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDepartmentActionPerformed
        // TODO add your handling code here:
        openDepartmentDialog();
    }//GEN-LAST:event_mniDepartmentActionPerformed

    private void mniAdvPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAdvPaymentActionPerformed
        // TODO add your handling code here:
        openAdvPaymentDialog();
    }//GEN-LAST:event_mniAdvPaymentActionPerformed

    private void mniBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBonusActionPerformed
        // TODO add your handling code here:
        openBonusDialog();
    }//GEN-LAST:event_mniBonusActionPerformed

    private void mniWorkDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniWorkDayActionPerformed
        // TODO add your handling code here:
        openWorkDay();
    }//GEN-LAST:event_mniWorkDayActionPerformed

    private void mniSalaryDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalaryDetailActionPerformed
        // TODO add your handling code here:
        openSalaryDetail();
    }//GEN-LAST:event_mniSalaryDetailActionPerformed

    private void mniReportDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReportDepActionPerformed
        // TODO add your handling code here:
        openDepartmentReport();
    }//GEN-LAST:event_mniReportDepActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        exitApplication();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        // TODO add your handling code here:
        openAttendance();
    }//GEN-LAST:event_btnAttendanceActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
//        openEmployeeDialog();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnReportSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportSalaryActionPerformed
        // TODO add your handling code here:
        openSalaryDetail();
    }//GEN-LAST:event_btnReportSalaryActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        openHelp();
    }//GEN-LAST:event_btnHelpActionPerformed

    private void mniGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuideActionPerformed
        // TODO add your handling code here:
        openGuide();
    }//GEN-LAST:event_mniGuideActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main2JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnReportSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblMainImage;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JMenuItem mniAdvPayment;
    private javax.swing.JMenuItem mniBonus;
    private javax.swing.JMenuItem mniChangePassword;
    private javax.swing.JMenuItem mniDepartment;
    private javax.swing.JMenuItem mniEmp;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniGuide;
    private javax.swing.JMenuItem mniHelp;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniReportDep;
    private javax.swing.JMenuItem mniSalaryDetail;
    private javax.swing.JMenuItem mniWorkDay;
    private javax.swing.JMenu mnuControl;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuReport;
    private javax.swing.JMenu mnuSystem;
    private javax.swing.JPopupMenu.Separator separator;
    // End of variables declaration//GEN-END:variables

    @Override
    public void initialize() {
        setLocationRelativeTo(null);
        openWelcomeDialog();
        openLoginDialog();
        startTimer();
        if (Auth.user == null) {
            setStatus("...");

        } else {
            setStatus("User: " + Auth.user.getFirstName() + " " + Auth.user.getLastName());
        }

    }

    @Override
    public void openJDialog(JDialog dialog) {
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    @Override
    public void exitApplication() {
        if (MsgBox.confirm(this, "Do you want to exit application?")) {
            System.exit(0);
        }
    }

    @Override
    public void setStatus(String status) {
        lblStatus.setText(status);
    }

    @Override
    public void startTimer() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        lblTimer.setText(XDate.format(new Date(), "hh:mm:ss a"));
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void openWelcomeDialog() {
        JDialog dialog = new WelcomeJDialog(this, true);
        openJDialog(dialog);
    }

    @Override
    public void openAdvPaymentDialog() {
        if (Auth.isLogin()) {
            if (Auth.isAccountant()) {
                JDialog dialog = new AdvancePaymentJDialog(this, true);
                openJDialog(dialog);
            } else {
                MsgBox.alert(this, "You dont have permission to use this feature");
            }
        } else {
            MsgBox.alert(this, "Please login to use the application");

        }
    }

    @Override
    public void openBonusDialog() {
        if (Auth.isLogin()) {
            if (Auth.isAccountant()) {
                JDialog dialog = new BonusJDialog(this, true);
                openJDialog(dialog);
            } else {
                MsgBox.alert(this, "You dont have permission to use this feature");
            }
        } else {
            MsgBox.alert(this, "Please login to use the application");

        }
    }

    @Override
    public void openChangePasswordDialog() {
        if (Auth.isLogin()) {
            JDialog dialog = new ChangPasswordJDialog(this, true);
            openJDialog(dialog);
        } else {
            MsgBox.alert(this, "Please login to use the application");
        }
    }

    @Override
    public void openDepartmentDialog() {
        if (Auth.isLogin()) {
            if (Auth.isManager()) {
                JDialog dialog = new DepartmentJDialog1(this, true);
                openJDialog(dialog);
            } else {
                MsgBox.alert(this, "You dont have permission to use this feature");
            }
        } else {
            MsgBox.alert(this, "Please login to use the application");
        }
    }

    @Override
    public void openEmployeeDialog() {
//        if (Auth.isLogin()) {
//            JDialog dialog = new EmployeeJDialog(this, true);
//            openJDialog(dialog);
//        } else {
//            MsgBox.alert(this, "Please login to use the application");
//        }
    }

    @Override
    public void openLoginDialog() {
        JDialog dialog = new LoginJDialog(this, true);
        openJDialog(dialog);

    }

    @Override
    public void openAttendance() {
        if (Auth.isLogin()) {
            if (Auth.isManager()) {
                TimeSheetJDialog3 dialog = new TimeSheetJDialog3(this, true);
                dialog.selectAttendanceTab();
                openJDialog(dialog);
            } else {
                MsgBox.alert(this, "You dont have permission to use this feature");
            }
        } else {
            MsgBox.alert(this, "Please login to use the application");
        }
    }

    @Override
    public void openWorkDay() {
        if (Auth.isLogin()) {
            TimeSheetJDialog3 dialog = new TimeSheetJDialog3(this, true);
            dialog.selectWorkDayTab();
            openJDialog(dialog);
        } else {
            MsgBox.alert(this, "Please login to use the application");

        }
    }

    @Override
    public void openSalaryDetail() {
        if (Auth.isLogin()) {
            if (Auth.isManager() || Auth.isAccountant()) {
                TimeSheetJDialog3 dialog = new TimeSheetJDialog3(this, true);
                dialog.selectSalaryDetailTab();
                openJDialog(dialog);
            } else {
                MsgBox.alert(this, "You dont have permission to use this feature");
            }
        } else {
            MsgBox.alert(this, "Please login to use the application");
        }
    }

    @Override
    public void openDepartmentReport() {
        if (Auth.isLogin()) {
            if (Auth.isManager()) {
                TimeSheetJDialog3 dialog = new TimeSheetJDialog3(this, true);
                dialog.selectReportOnDepartmentTab();
                openJDialog(dialog);
            } else {
                MsgBox.alert(this, "You dont have permission to use this feature");
            }
        } else {
            MsgBox.alert(this, "Please login to use the application");

        }
    }

    @Override
    public void openGuide() {
        JDialog dialog = new IntroduceJDialog(this, true);
        openJDialog(dialog);
    }

    @Override
    public void openHelp() {
        try {
            File htmlFile = new File("src/main/resources/TabUI/index.html");

            // Check if the file exists before attempting to open it
            if (htmlFile.exists()) {
                Desktop.getDesktop().browse(htmlFile.toURI());
            } else {
                MsgBox.alert(this, "File not found: " + htmlFile.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace(); // Consider logging the exception or displaying a more detailed error message
            MsgBox.alert(this, "Error opening the URL: " + e.getMessage());
        }

    }

    @Override
    public void logout() {
        Auth.clear();
        setStatus("...");
        login();
    }

    @Override
    public void login() {
        if (Auth.isLogin()) {
            MsgBox.alert(this, "Bạn đã đăng nhập");
        } else {
            openLoginDialog();
            if (Auth.user == null) {
                setStatus("...");
            } else {
                setStatus("User: " + Auth.user.getFirstName() + " " + Auth.user.getLastName());
            }
        }

    }
}
