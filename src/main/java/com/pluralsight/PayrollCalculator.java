package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            BufferedReader readFile = new BufferedReader(new FileReader("employees.csv"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
