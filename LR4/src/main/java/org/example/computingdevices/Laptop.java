package org.example.computingdevices;

public class Laptop extends ComputingDevice{
    VideoGraphic videoCard;
    public Laptop(String pName, Integer pCoresCount, Double pCoresSpeed, Integer pRAM, Integer pStorage, VideoGraphic pVideoCard) {
        super(pName, pCoresCount, pCoresSpeed, pRAM, pStorage);

        pVideoCard.setIntegred(Boolean.TRUE);
        this.videoCard = pVideoCard;
    }

    public VideoGraphic getVideoCard() {
        return videoCard;
    }

    @Override
    public String toString() {
        String start = super.toString();
        return start + this.videoCard.toString();
    }

    @Override
    public String getTypeOfDevice(){
        return "Type: Laptop";
    }
}
