package org.example.employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeStorage {
    HashMap<AgeCategory, ArrayList<Employee>> base;

    public EmployeeStorage(){
        this.base = new HashMap<>();
        this.base.put(AgeCategory.Nothing, new ArrayList<>());
        this.base.put(AgeCategory.Child, new ArrayList<>());
        this.base.put(AgeCategory.Young, new ArrayList<>());
        this.base.put(AgeCategory.Adults, new ArrayList<>());
        this.base.put(AgeCategory.Elderly, new ArrayList<>());
        this.generateStorage();
    }

    private void generateStorage(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.addItem(
                new Employee(
                        "Andry",
                        "Information System",
                        LocalDate.parse("1978-05-23", formatter),
                        16000.00
                )
        );
        this.addItem(
                new Employee(
                        "Alex",
                        "Information Security",
                        LocalDate.parse("1950-12-03", formatter),
                        20250.00
                )
        );
        this.addItem(
                new Employee(
                        "Kristina",
                        "Marketing",
                        LocalDate.parse("2001-01-13", formatter),
                        12600.00
                )
        );
        this.addItem(
                new Employee(
                        "Elena",
                        "Information System",
                        LocalDate.parse("1980-07-20", formatter),
                        24000.00
                )
        );
        this.addItem(
                new Employee(
                        "Henry",
                        "Information System",
                        LocalDate.parse("2000-10-04", formatter),
                        16000.00
                )
        );
        this.addItem(
                new Employee(
                        "Kris",
                        "DevOps",
                        LocalDate.parse("1994-02-14", formatter),
                        22000.00
                )
        );
    }

    public void addItem(Employee item){
        Integer age = item.getAge();
        AgeCategory category = AgeCategoriesHelper.getCategory(age);
        this.base.get(category).add(item);
    }

    public Employee findItem(AgeCategory category, Integer id){
        if(id >= Employee.nextID){
            return null;
        }
        for(Employee item: this.base.get(category)){
            if(item.getId() == id){
                return item;
            }
        }
        System.out.println("Employee with id " + id + " has been not found.");
        return null;
    }

    public void deleteItem(AgeCategory category, Integer id){
        if(id >= Employee.nextID){
            return;
        }
        ArrayList<Employee> list = this.base.get(category);
        for(Integer i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                list.remove(list.get(i));
                this.base.remove(category);
                this.base.put(category, list);
                System.out.println("Employee with id " + id + " has been deleted!");
                return;
            }
        }
    }

    public void printEmployers(){
        for(AgeCategory category : AgeCategoriesHelper.getList()){
            for(Employee item: this.base.get(category)){
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public String toString() {
        return this.base.toString();
    }
}
