package org.example.computingdevices;

import java.util.ArrayList;

public class AIServer extends Server{
    ArrayList<VideoGraphic> videoCardsList;
    public AIServer(String pName, Integer pCoresCount, Double pCoresSpeed, Integer pRAM, Integer pStorage, Boolean pInCluster) {
        super(pName, pCoresCount, pCoresSpeed, pRAM, pStorage, pInCluster);
        videoCardsList = new ArrayList<>();
        videoCardsList.add(new VideoGraphic(
                "Tesla V100",
                32,
                Boolean.FALSE,
                Boolean.FALSE
        ));
        videoCardsList.add(new VideoGraphic(
                "Tesla V100",
                32,
                Boolean.FALSE,
                Boolean.FALSE
        ));
    }

    @Override
    public String toString(){
        String res = super.toString();
        Integer number = 1;
        for (VideoGraphic v: videoCardsList){
            res += "AIVideocard " + number.toString() + ": \n" + v.toString();
            number++;
        }
        return res;
    }
}
