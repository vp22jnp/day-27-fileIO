package com.payroll;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();;

   public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>();
    }

    /**
     * Create a Constructor
     */

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        employeePayrollList = new ArrayList<>();
        this.employeePayrollList = employeePayrollList;

    }

    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    public void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll to console\n" + employeePayrollList);
    }

    public void printData(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().printData();

    }

    public long countEntries(IOService ioService) {
        long entries = 0;
        if (ioService.equals(IOService.FILE_IO))
            entries = new EmployeePayrollFileIOService().countEntries();
        return entries;
    }

}

