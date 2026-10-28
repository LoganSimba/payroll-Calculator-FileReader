package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {
        // try catch block to catch any errors that might occur
        try {
            // buffer reader to read what is in the file
            BufferedReader readFile = new BufferedReader(new FileReader("employees.csv"));
            readFile.readLine();

            String line;
            //while loop to iterate and read each line from the file
            while((line = readFile.readLine()) != null){
               // split the line in the file
              String[] parts =  line.split("\\|");
              int employeeId = Integer.parseInt(parts[0]);
              String name = parts[1];
              double hoursWorked = Double.parseDouble(parts[2]);
              double payRate = Double.parseDouble(parts[3]);

              // creating new instances of employees by getting information from the
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                System.out.println(employee.toString() + " Gross pay: " + employee.GrossPay());

            }

        }
        // catch exceptions and prints messages when something goes wrong
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
