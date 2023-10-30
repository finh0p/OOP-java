package org.example.employee;

import java.util.ArrayList;

public class AgeCategoriesHelper {
    public static AgeCategory getCategory(Integer age){
        AgeCategory res = AgeCategory.Nothing;
        if (age >= 0 && age < 12){
            res = AgeCategory.Child;
        } else if(age >= 12 && age < 25) {
            res = AgeCategory.Young;
        } else if(age >= 25 && age < 60) {
            res = AgeCategory.Adults;
        } else if(age >= 60) {
            res = AgeCategory.Elderly;
        }
        return res;
    }

    public static ArrayList<AgeCategory> getList(){
        ArrayList<AgeCategory> list = new ArrayList<>();
        list.add(AgeCategory.Nothing);
        list.add(AgeCategory.Child);
        list.add(AgeCategory.Young);
        list.add(AgeCategory.Adults);
        list.add(AgeCategory.Elderly);
        return list;
    }
}
