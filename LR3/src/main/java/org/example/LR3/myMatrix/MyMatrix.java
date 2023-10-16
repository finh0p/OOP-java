package org.example.LR3.myMatrix;

import org.example.LR3.myMatrix.Calculations.GeneratorCalculator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyMatrix {
    private ArrayList<ArrayList<Double>> matrix;
    private Integer rowCount;
    private Integer columnCount;

    public MyMatrix(Integer i, Integer j){
        this.rowCount = i;
        this.columnCount = j;
        this.matrix = new ArrayList<ArrayList<Double>>();
    }

    public void inputMatrix() throws Exception{
        Scanner sc = new Scanner(System.in);
        for(Integer i = 0; i < this.rowCount; i++){
            System.out.println("Enter element" + i + " row: ");
            ArrayList<Double> row = new ArrayList<Double>();
            for(Integer j= 0; j < this.columnCount; j++){
                row.add(sc.nextDouble());
            }
        }
    }

    public void AddRow(ArrayList<Double> row){
        this.matrix.add(row);
    }

    public void generateMatrix(){
        Random rnd = new Random();
        for(Integer i = 0; i < this.rowCount; i++){
            ArrayList<Double> row = new ArrayList<Double>();
            for(Integer j = 0; j < this.columnCount; j++){
                row.add(rnd.nextDouble() / 0.01);
            }
            this.matrix.add(row);
        }
    }

    public Integer getColumnCount() {
        return columnCount;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public ArrayList<Double> getMatrixRow(Integer i){
        return this.matrix.get(i);
    }

    public void setMatrixRow(Integer i, ArrayList<Double> row){
        this.matrix.set(i, row);
    }

    public void inputMatrixRow(Integer i){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> row = new ArrayList<Double>();
        for(Integer j = 0; j < this.columnCount; j++){
            row.add(sc.nextDouble());
        }
        this.matrix.set(i, row);
    }

    public void printMatrix(){
        for(ArrayList<Double> r : this.matrix){
            System.out.println(r);
        }
    }

    public void printMatrixWithMean(){
        for(Integer i = 0; i < this.rowCount; i++){
            System.out.print(this.getMatrixRow(i));
            System.out.print(" ");
            System.out.println(GeneratorCalculator.getMeanOnRow(this, i));
        }
    }
}
