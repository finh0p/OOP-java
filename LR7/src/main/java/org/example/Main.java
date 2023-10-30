package org.example;

import org.example.employee.AgeCategory;
import org.example.employee.Employee;
import org.example.employee.EmployeeStorage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EmployeeStorage storage = new EmployeeStorage();
        storage.printEmployers();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        storage.addItem(new Employee(
                "Kira",
                "Information System",
                LocalDate.parse("2003-10-06",formatter),
                9000.00
        ));
        storage.printEmployers();
        System.out.println(storage.findItem(AgeCategory.Young, 2));
        storage.deleteItem(AgeCategory.Young, 2);
        System.out.println(storage.findItem(AgeCategory.Young, 2));
    }
}