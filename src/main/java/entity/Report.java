/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author caube
 */
public class Report {
    public static class SalaryDetail {
       private Employee employee;
       private double advPayment;
       private double bonus;
       private double totalSalary;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public double getAdvPayment() {
            return advPayment;
        }

        public void setAdvPayment(double advPayment) {
            this.advPayment = advPayment;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        public double getTotalSalary() {
            return totalSalary;
        }

        public void setTotalSalary(double totalSalary) {
            this.totalSalary = totalSalary;
        }
       
       
    }
    
    public static class Attendance {
        private Employee employee;
        private int workDay;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public int getWorkDay() {
            return workDay;
        }

        public void setWorkDay(int workDay) {
            this.workDay = workDay;
        }
        
        
    }
    

   
    
}
