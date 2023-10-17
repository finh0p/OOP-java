package org.example.computingdevices;

public class PC extends ComputingDevice {
    private Integer Power;
    protected VideoGraphic VideoCard;

    public PC(String pName, Integer pCoresCount, Double pCoresSpeed, Integer pRAM, Integer pStorage, VideoGraphic pVideoCard, Integer pPower) {
        super(pName, pCoresCount, pCoresSpeed, pRAM, pStorage);
        this.Power = pPower;
        pVideoCard.setIntegred(Boolean.FALSE);
        this.VideoCard = pVideoCard;
    }

    @Override
    public String toString() {
        String start = super.toString();
        return start +
                "Power: " + this.Power + "W\n" +
                this.VideoCard.toString();
    }

    @Override
    public String getTypeOfDevice(){
        return "Type: PC";
    }
}
