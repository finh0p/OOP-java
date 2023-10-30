package org.example;

import org.example.myCollections.NumericalStatisticsData;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NumericalStatisticsData<Integer> t1 = new NumericalStatisticsData<>();
        NumericalStatisticsData<Float> t2 = new NumericalStatisticsData<>();
        NumericalStatisticsData<Double> t3 = new NumericalStatisticsData<>();
        Random rnd = new Random();
        for(Integer i = 0; i < 15; i++){
            t1.add(rnd.nextInt(100));
            t2.add(100 * rnd.nextFloat());
            t3.add(100 * rnd.nextDouble());
        }
        System.out.println(
                "T1: " + t1.toString() + "\n" +
                        "Sum = " + t1.sum() + "\n" +
                        "M = " + t1.mean() + "\n" +
                        "D = " + t1.dispersion() + "\n" +
                        "sd = " + t1.standardDeviation() + "\n"
        );
        System.out.println(
                "T2: " + t2.toString() + "\n" +
                        "Sum = " + t2.sum() + "\n" +
                        "M = " + t2.mean() + "\n" +
                        "D = " + t2.dispersion() + "\n" +
                        "sd = " + t2.standardDeviation() + "\n"
        );
        System.out.println(
                "T3: " + t3.toString() + "\n" +
                        "Sum = " + t3.sum() + "\n" +
                        "M = " + t3.mean() + "\n" +
                        "D = " + t3.dispersion() + "\n" +
                        "sd = " + t3.standardDeviation() + "\n"
        );
    }
}