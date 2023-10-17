package org.example.computingdevices;

public class VideoGraphic {
    private String Name;
    private Integer VRAM;
    private Boolean RTX;
    private Boolean Integred;

    public VideoGraphic(String pName, Integer pVRAM, Boolean pRTX, Boolean pIntegreted){
        this.Name = pName;
        this.VRAM = pVRAM;
        this.RTX = pRTX;
        this.Integred = pIntegreted;
    }

    public String getName() {
        return Name;
    }

    public Boolean getIntegred() {
        return Integred;
    }

    public Boolean getRTX() {
        return RTX;
    }

    public Integer getVRAM() {
        return VRAM;
    }

    protected void setIntegred(Boolean integred) {
        Integred = integred;
    }

    @Override
    public String toString() {
        return "Video Graphic:\n" +
                "Name: " + this.Name + "\n" +
                "VRAM: " + this.VRAM + "\n" +
                "RTX: " + this.RTX.toString() + "\n" +
                "Integred: " + this.Integred.toString() + "\n";
    }
}
