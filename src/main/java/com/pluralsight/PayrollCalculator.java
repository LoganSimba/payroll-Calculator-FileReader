package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // try catch block to catch any errors that might occur
        try {
            System.out.print("Enter the name of the file to process: ");
            String fileToProcess = scanner.nextLine().trim();

            System.out.print("Enter the name of the payroll file to create: ");
            String newFile = scanner.nextLine().trim();

            BufferedWriter writeFile = new BufferedWriter(new FileWriter(newFile,true));


            // buffer reader to read what is in the file
            BufferedReader readFile = new BufferedReader(new FileReader(fileToProcess));

            readFile.readLine();

            String line;
            //while loop to iterate and read each line from the file
            while ((line = readFile.readLine()) != null) {
                // split the line in the file
                String[] parts = line.split("\\|");
                int employeeId = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);

                // creating new instances of employees by getting information from the
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                writePayrollFile(writeFile, employee, scanner);
                //  System.out.println(employee.toString() + " Gross pay: " + employee.GrossPay());

            }
            writeFile.close();


        }
        // catch exceptions and prints messages when something goes wrong
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

        public static void writePayrollFile(BufferedWriter writeFile, Employee employee, Scanner scanner){
           try {

               //prompt user for the name of the file they want to create


                //create the bufferedWriter


               String lineToWrite = String.format("%s|%s|%s",
                       employee.getEmployeeId(),
                       employee.getName(),
                       employee.GrossPay());

               //we write to the new file
               writeFile.write(lineToWrite);
               writeFile.newLine();

           }
           catch(Exception e){
               System.out.println(e.getMessage());
           }
        }

    }

