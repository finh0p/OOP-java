/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncfu.lr1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kira
 */
public class Solver {
    protected ArrayList<Double> sourceList;
    protected double minElem = Double.MAX_VALUE;
    protected double maxElem = Double.MIN_VALUE;
    protected double mean;
    
    public Solver(int length){
        this.sourceList = new ArrayList<Double>(length);
        Random rnd = new Random();
        for (int i = 0; i < length; i++){
            this.sourceList.add(rnd.nextDouble());
        }
        this.printList();
    }
    
    public void solveProblem(){
        if (this.sourceList.isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        this.searchMinElem();
        this.searchMaxElem();
        this.searchMean();
        System.out.println("Sum of min and max elements: " + String.valueOf(this.maxElem + this.minElem));
        System.out.println("Mean: " + String.valueOf(this.mean));
    }
    
    protected void searchMinElem(){
        for (double item : this.sourceList){
            if (item < this.minElem){
                this.minElem = item;
            }
        }        
    }
    
    protected void searchMaxElem(){
        for (double item : this.sourceList){
            if (item > this.maxElem){
                this.maxElem = item;
            }
        }
    }
    
    protected void searchMean(){
        double sum = 0;
        for (double item : this.sourceList){
            sum += item;
        }
        this.mean = sum / this.sourceList.size();
    }
    
    public void printList(){
        if (this.sourceList.isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        System.out.println("List elements:");
        for (double item:  this.sourceList){
            System.out.print(String.valueOf(item)+"\t");
        }
        System.out.print("\n");
    }
}
