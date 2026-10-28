package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    //constructor for Employee class
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
    // method for calculating and returning gross pay
    public double GrossPay(){
        double grossPay = (double)this.hoursWorked * this.payRate;
        return grossPay;
    }
    // added a tostring method to read
    public String toString() {
        return "ID: " + getEmployeeId()
                + " | Name: " + getName()
                + " | Hours: " + getHoursWorked()
                + " | Pay Rate: $" + getPayRate();
    }
}
