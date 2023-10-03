package org.example;

public enum Condition {
    OK ("Успешно"),
    Fail("Отменен"),
    InProcess ("В процессе");

    private String title;

    Condition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
