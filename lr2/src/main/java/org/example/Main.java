package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
     public static Integer getPrice(Product p){
        return switch(p) {
            case CPU, PowerUnit -> 1200;
            case GPU -> 3600;
            case Laptop -> 5000;
            case Memory -> 800;
            case Storage -> 1600;
        };
    }

    public static Product getProductByCode(Integer code) throws Exception {
         if (code > Product.values().length || code < 1){
             throw new Exception("Невeрное значение");
         }
         return switch(code){
             case 1 -> Product.Laptop;
             case 2 -> Product.CPU;
             case 3 -> Product.GPU;
             case 4 -> Product.Memory;
             case 5 -> Product.Storage;
             default -> Product.PowerUnit;
         };
    }
    public static Condition getConditionByCode(Integer code) throws Exception {
        if (code > Condition.values().length || code < 1){
            throw new Exception("Невeрное значение");
        }
        return switch(code){
            case 1 -> Condition.OK;
            case 2 -> Condition.Fail;
            default -> Condition.InProcess;
        };
    }

    public static void printInvitation(){
        System.out.println("Выберите действие:");
        System.out.println("1.Вывести список");
        System.out.println("2. Вывести список по статусу");
        System.out.println("3. Вывести список по продукту");
        System.out.println("4. Добавить запись");
        System.out.println("0. Выход");
        System.out.print("->");
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        AccountingBook book = new AccountingBook();
        book.generateNotes();

        Scanner sc = new Scanner(System.in);
        int act = 0;
        do {
            Main.printInvitation();
            act = sc.nextInt();
            try {
                switch (act) {
                    case 1:
                        book.getAllList();
                        break;
                    case 2:
                        book.selectItemsByCondition();
                        break;
                    case 3:
                        book.selectItemsByProduct();
                        break;
                    case 4:
                        book.addNote();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Введено неправильное значение! Повторите ввод.");
                }
            } catch (Exception err) {
                System.err.println(err.getMessage());
            }
        } while (act != 0);
    }
}