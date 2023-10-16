package org.example;

import org.example.LR3.myMatrix.Calculations.GeneratorCalculator;
import org.example.LR3.myMatrix.MyMatrix;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer i, j;
        System.out.println("Enter i and j:");
        i = sc.nextInt();
        j = sc.nextInt();
        MyMatrix sourceMatrix = new MyMatrix(i, j);
        sourceMatrix.generateMatrix();
        System.out.println("Source matrix: ");
        sourceMatrix.printMatrixWithMean();
        MyMatrix resMatrix = GeneratorCalculator.generateResMatrix(sourceMatrix);
        System.out.println("Result matrix:");
        resMatrix.printMatrix();
    }
}