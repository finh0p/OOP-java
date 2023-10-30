package org.example.myCollections;

import java.util.ArrayList;

public class NumericalStatisticsData<T extends Number>{
    ArrayList<T> list;

    public void add(T item){
        this.list.add(item);
    }

    public NumericalStatisticsData(){
        this.list = new ArrayList<>();
    }

    public Double sum(){
        Double s = 0.0;
        for(T item: this.list){
            s += Double.parseDouble(item.toString());
        }
        return s;
    }

    public Double mean(){
        return this.sum() / this.list.size();
    }

    public Double dispersion(){
        Double m = this.mean();
        Double s = 0.0;
        for(T item: this.list){
            s += Math.pow(Double.parseDouble(item.toString()) - m, 2);
        }
        return s / (this.list.size() - 1);
    }

    public Double standardDeviation(){
        return Math.sqrt(this.dispersion());
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
