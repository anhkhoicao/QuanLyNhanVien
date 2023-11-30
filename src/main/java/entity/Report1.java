/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author caube
 */
public class Report1 {

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

        @Override
        public String toString() {
            return "Attendance{" + "employee=" + employee + ", workDay=" + workDay + '}';
        }

    }

    public static class ReportOnDepartment {

        private String departmentName;
        private int noEmp;
        private double totalSalary;
        private double highestSalary;
        private double lowestSalary;
        private double avgSalary;

        public ReportOnDepartment() {
        }

        public ReportOnDepartment(String departmentName, int noEmp, double totalSalary, double highestSalary, double lowestSalary, double avgSalary) {
            this.departmentName = departmentName;
            this.noEmp = noEmp;
            this.totalSalary = totalSalary;
            this.highestSalary = highestSalary;
            this.lowestSalary = lowestSalary;
            this.avgSalary = avgSalary;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public int getNoEmp() {
            return noEmp;
        }

        public void setNoEmp(int noEmp) {
            this.noEmp = noEmp;
        }

        public double getTotalSalary() {
            return totalSalary;
        }

        public void setTotalSalary(double totalSalary) {
            this.totalSalary = totalSalary;
        }

        public double getHighestSalary() {
            return highestSalary;
        }

        public void setHighestSalary(double highestSalary) {
            this.highestSalary = highestSalary;
        }

        public double getLowestSalary() {
            return lowestSalary;
        }

        public void setLowestSalary(double lowestSalary) {
            this.lowestSalary = lowestSalary;
        }

        public double getAvgSalary() {
            return avgSalary;
        }

        public void setAvgSalary(double avgSalary) {
            this.avgSalary = avgSalary;
        }

        @Override
        public String toString() {
            return "ReportOnDepartment{" + "departmentName=" + departmentName + 
                    ", noEmp=" + noEmp + ", totalSalary=" + totalSalary + 
                    ", highestSalary=" + highestSalary + ", lowestSalary=" + lowestSalary + 
                    ", avgSalary=" + avgSalary + '}';
        }
        
        

    }

    public static class SalaryDetail {

        private Employee employee;
        private double ap;
        private double bonus;
        private int noDayAttendance;
        private int workDayInMonth;
        private double totalSalary;

        public SalaryDetail() {
        }

        public SalaryDetail(Employee employee, double ap, double bonus, int noDayAttendance, int workDayInMonth, double totalSalary) {
            this.employee = employee;
            this.ap = ap;
            this.bonus = bonus;
            this.noDayAttendance = noDayAttendance;
            this.workDayInMonth = workDayInMonth;
            this.totalSalary = totalSalary;
        }

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public double getAp() {
            return ap;
        }

        public void setAp(double ap) {
            this.ap = ap;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        public int getNoDayAttendance() {
            return noDayAttendance;
        }

        public void setNoDayAttendance(int noDayAttendance) {
            this.noDayAttendance = noDayAttendance;
        }

        public int getWorkDayInMonth() {
            return workDayInMonth;
        }

        public void setWorkDayInMonth(int workDayInMonth) {
            this.workDayInMonth = workDayInMonth;
        }

        public double getTotalSalary() {
            return totalSalary;
        }

        public void setTotalSalary(double totalSalary) {
            this.totalSalary = totalSalary;
        }

        @Override
        public String toString() {
            return "SalaryDetail{" + "employee=" + employee +
                    ", ap=" + ap + ", bonus=" + bonus + ", noDayAttendance=" +
                    noDayAttendance + ", workDayInMonth=" + workDayInMonth + ", totalSalary=" + totalSalary + '}';
        }

    }

}
