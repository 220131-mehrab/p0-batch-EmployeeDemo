package com.revature.EmployeeDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    static List<String> lines;

    public static void main (String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
//
        ArrayList<Employees> emps = new ArrayList<Employees>();
        String currentline

        String empsFileName = "src/main/resources/employee.csv";
        App app = new App();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(empsFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (br.ready() ) {
            lines = br.lines();
        }

        for (String emp1: lines) {
            System.out.println(lines);
        }
    }
}
