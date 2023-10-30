package org.example.employee;

import java.time.LocalDate;

public class Employee {
    protected static Integer nextID = 0;
    private Integer id;
    private String name;
    private String department;
    private LocalDate birthday;
    private Double salary;

    public Employee(String pName, String pDepartment, LocalDate pBirthday, Double pSalary){
        this.id = nextID++;
        this.name = pName;
        this.department = pDepartment;
        this.birthday = pBirthday;
        this.salary = pSalary;
    }

    public Integer getAge(){
        LocalDate now = LocalDate.now();
        Integer age = LocalDate.now().getYear() - this.birthday.getYear();
        if(
                now.getMonthValue() > this.birthday.getMonthValue() ||
                now.getMonthValue() == this.birthday.getMonthValue() && now.getDayOfMonth() >= this.birthday.getDayOfMonth()
        ){
            age++;
        }
        return age > 0 ? age : 0;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Age Category: " + AgeCategoriesHelper.getCategory(this.getAge()) + "\n" +
                "Department: " + this.department + " Department\n" +
                "Salary: " + this.salary + "\n";
    }
}
