package org.example.computingdevices;

public class PC extends ComputingDevice implements IVideoDriver{
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

    public void printImage(){
        System.out.println(
                "      ooooooooooooooooooooooooooooooooooooo\n" +
                        "      8                                .d88\n" +
                        "      8  oooooooooooooooooooooooooooood8888\n" +
                        "      8  8888888888888888888888888P\"   8888    oooooooooooooooo\n" +
                        "      8  8888888888888888888888P\"      8888    8              8\n" +
                        "      8  8888888888888888888P\"         8888    8             d8\n" +
                        "      8  8888888888888888P\"            8888    8            d88\n" +
                        "      8  8888888888888P\"               8888    8           d888\n" +
                        "      8  8888888888P\"                  8888    8          d8888\n" +
                        "      8  8888888P\"                     8888    8         d88888\n" +
                        "      8  8888P\"                        8888    8        d888888\n" +
                        "      8  8888oooooooooooooooooooooocgmm8888    8       d8888888\n" +
                        "      8 .od88888888888888888888888888888888    8      d88888888\n" +
                        "      8888888888888888888888888888888888888    8     d888888888\n" +
                        "                                               8    d8888888888\n" +
                        "         ooooooooooooooooooooooooooooooo       8   d88888888888\n" +
                        "        d                       ...oood8b      8  d888888888888\n" +
                        "       d              ...oood888888888888b     8 d8888888888888\n" +
                        "      d     ...oood88888888888888888888888b    8d88888888888888\n" +
                        "     dood8888888888888888888888888888888888b\n"
        );
    }
}
