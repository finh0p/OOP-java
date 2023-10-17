package org.example;

import org.example.computingdevices.*;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<ComputingDevice> list = CDGenerator.generateList();
        for(ComputingDevice device: list) {
            System.out.println(device.getTypeOfDevice());
            System.out.print(device.toString() + "\n");
        }
    }
}