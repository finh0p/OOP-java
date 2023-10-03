package org.example;

public enum Product {
    Laptop ("Ноутбук"),
    CPU ("Процессор"),
    GPU ("Видеокарта"),
    Memory ("Оперативная память"),
    Storage ("Жесткий диск"),
    PowerUnit ("Блок питания");

    private String title;

    Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
};
