package com.example.lr9.Calculation;

public class Calculator {

    public static Double Calc(Integer N, Integer K, Integer f, Integer t, Double x, Double y) {
        Double res = 0.0;
        for (Integer i = 1; i < N+1; i++){
            for (Integer j = 1; j < K+1; j++){
                res += (Math.pow(t,i) * Math.pow(x, i) + Math.pow(f, j) * Math.pow(y, j)) / (t * i * j);
            }
        }
        return res;
    }
}
