package com.payroll;

public class EmployeePayrollData {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public EmployeePayrollData(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }


    @Override
    public String toString() {
        return "EmployeePayrollData [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "]";
    }

}

