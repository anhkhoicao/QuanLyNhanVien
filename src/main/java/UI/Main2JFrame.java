/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author caube
 */
public class Main2JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main2JFrame
     */
    public Main2JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        mniChangePassword = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        mnuControl = new javax.swing.JMenu();
        mniEmp = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        mniAdvPayment = new javax.swing.JMenuItem();
        mniBonus = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenu();
        mniAttendance = new javax.swing.JMenuItem();
        mniWorkDay = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniSalaryDetail = new javax.swing.JMenuItem();
        mniReportDep = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mniGuide = new javax.swing.JMenuItem();
        mniHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-manager-24.png"))); // NOI18N
        lblStatus.setText("User:");
        lblStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel1.add(lblStatus, java.awt.BorderLayout.LINE_START);

        lblTimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-clock-24.png"))); // NOI18N
        lblTimer.setText("Timer");
        lblTimer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel1.add(lblTimer, java.awt.BorderLayout.LINE_END);

        mnuSystem.setText("System");

        mniLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-login-24.png"))); // NOI18N
        mniLogin.setText("Login");
        mnuSystem.add(mniLogin);

        mniLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-logout-24.png"))); // NOI18N
        mniLogout.setText("Logout");
        mnuSystem.add(mniLogout);

        mniChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-update-24 (2).png"))); // NOI18N
        mniChangePassword.setText("ChangePassword");
        mnuSystem.add(mniChangePassword);
        mnuSystem.add(jSeparator1);

        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-exit-24 (1).png"))); // NOI18N
        mniExit.setText("Exit");
        mnuSystem.add(mniExit);

        jMenuBar1.add(mnuSystem);

        mnuControl.setText("Control");

        mniEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-user-24 (1).png"))); // NOI18N
        mniEmp.setText("Employee");
        mnuControl.add(mniEmp);
        mnuControl.add(separator);

        mniAdvPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-dollar-24.png"))); // NOI18N
        mniAdvPayment.setText("AdvPayment");
        mnuControl.add(mniAdvPayment);

        mniBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-bonus-24.png"))); // NOI18N
        mniBonus.setText("Bonus-Fine");
        mnuControl.add(mniBonus);

        jMenuBar1.add(mnuControl);

        mnuReport.setText("Report");

        mniAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-attendance-24.png"))); // NOI18N
        mniAttendance.setText("Attendance");
        mnuReport.add(mniAttendance);

        mniWorkDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-clock-24.png"))); // NOI18N
        mniWorkDay.setText("WorkDay");
        mnuReport.add(mniWorkDay);
        mnuReport.add(jSeparator2);

        mniSalaryDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-file-invoice-dollar-24.png"))); // NOI18N
        mniSalaryDetail.setText("SalaryDetail");
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
        mniGuide.setText("Guide");
        mnuHelp.add(mniGuide);

        mniHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/icons8-help-24-3.png"))); // NOI18N
        mniHelp.setText("Help");
        mnuHelp.add(mniHelp);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniReportDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReportDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniReportDepActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JMenuItem mniAdvPayment;
    private javax.swing.JMenuItem mniAttendance;
    private javax.swing.JMenuItem mniBonus;
    private javax.swing.JMenuItem mniChangePassword;
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
}
