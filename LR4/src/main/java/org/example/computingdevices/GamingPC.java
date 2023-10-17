package org.example.computingdevices;

public class GamingPC extends PC{
    public GamingPC(String pName, Integer pCoresCount, Double pCoresSpeed, Integer pRAM, Integer pStorage, VideoGraphic pVideoCard, Integer pPower) {
        super(pName, pCoresCount, pCoresSpeed, pRAM, pStorage, pVideoCard, pPower);
        super.VideoCard.setRTX(Boolean.TRUE);
    }

    @Override
    public String toString(){
        String start = super.toString();
        return "It's a Gaming PC\n" + start;
    }
}
