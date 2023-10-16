package org.example.LR3.myMatrix.Calculations;

import org.example.LR3.myMatrix.MyMatrix;

import java.util.ArrayList;

public class GeneratorCalculator {
    public static MyMatrix generateResMatrix(MyMatrix source){
        MyMatrix res = new MyMatrix(source.getRowCount(), source.getColumnCount());
        for(Integer i = 0; i < source.getRowCount(); i++){
            ArrayList<Double> row = new ArrayList<Double>();
            Double mean = GeneratorCalculator.getMeanOnRow(source, i);
            for(Double elem: source.getMatrixRow(i)){
                if(elem < mean){
                    row.add(0.0);
                } else if (elem > mean){
                    row.add(1.0);
                } else {
                    row.add(elem);
                }
            }
            res.AddRow(row);
        }
        return res;
    }

    public static Double getMeanOnRow(MyMatrix source, Integer i){
        Double sum = 0.0;
        for(Double item: source.getMatrixRow(i)){
            sum += item;
        }
        return sum / source.getColumnCount();
    }
}
