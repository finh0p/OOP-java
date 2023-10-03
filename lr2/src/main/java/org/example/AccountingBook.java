package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class AccountingBook {
    protected ArrayList<Note> notes = new ArrayList<Note>();
    public void generateNotes(){
        this.notes.add(new Note(1,"Алексей", Product.GPU, 1, Condition.OK));
        this.notes.add(new Note(1,"Генадий", Product.Storage, 2, Condition.InProcess));
        this.notes.add(new Note(2,"Василий", Product.CPU, 1, Condition.Fail));
        this.notes.add(new Note(1,"Алексей", Product.Memory, 4, Condition.OK));
        this.notes.add(new Note(3,"Андрей", Product.PowerUnit, 2, Condition.InProcess));
        this.notes.add(new Note(4,"Роман", Product.CPU, 1, Condition.OK));
        this.notes.add(new Note(5,"Григорий", Product.GPU, 1, Condition.OK));
    }

    protected void printInfo(Note n){
        System.out.println("Клиент " + n.getClient().toString() + " купил " + n.getProduct().getTitle()
                + " в количестве " + n.getCount().toString() + " на сумму " + n.getAmount().toString()
                + ". Статус заказа: " + n.getCondition().getTitle()
        );
    }

    public void getAllList(){
        for(Note n: notes){
            this.printInfo(n);
        }
    }

    public void selectItemsByCondition() throws Exception{
        System.out.println("Выберите состояние:");
        System.out.println("1. Успешно");
        System.out.println("2. Отменен");
        System.out.println("3. В процессе");
        Scanner sc = new Scanner(System.in);
        printItemsByCondition(Main.getConditionByCode(sc.nextInt()));
    }

    protected void printItemsByCondition(Condition c){
        for(Note n: notes){
            if(n.condition == c){
                this.printInfo(n);
            }
        }
    }

    public void selectItemsByProduct() throws Exception {
        System.out.println("Выберите продукт:");
        System.out.println("1. Ноутбук");
        System.out.println("2. Процессор");
        System.out.println("3. Видеокарта");
        System.out.println("4. Оперативная память");
        System.out.println("5. Жесткий диск");
        System.out.println("6. Блок питания");
        System.out.print("->");
        Scanner sc = new Scanner(System.in);
        Integer code = sc.nextInt();
        Product p = Main.getProductByCode(code);
        printItemsByProduct(p);
    }

    protected void printItemsByProduct(Product p){
        for(Note n: notes){
            if(n.product == p){
                this.printInfo(n);
            }
        }
    }

    public void addNote(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите id клиента (" + Client.lastInd+ " последний id, если ввести число больше него, то будет создан новый пользователь)");
            Integer id = sc.nextInt();
            System.out.print("Введите имя клиента: ");
            String client = sc.next();
            System.out.println("Выберите продукт:");
            System.out.println("1. Ноутбук");
            System.out.println("2. Процессор");
            System.out.println("3. Видеокарта");
            System.out.println("4. Оперативная память");
            System.out.println("5. Жесткий диск");
            System.out.println("6. Блок питания");
            System.out.print("->");
            Integer code = sc.nextInt();
            Product p = Main.getProductByCode(code);
            System.out.print("Введите количество -> ");
            Integer count = sc.nextInt();
            Condition status = Condition.InProcess;
            notes.add(new Note(id, client, p, count, status));
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
