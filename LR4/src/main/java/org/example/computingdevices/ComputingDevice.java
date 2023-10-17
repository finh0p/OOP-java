package org.example.computingdevices;

public class ComputingDevice {
    private String Name;
    private Integer CoresCount;
    private Double CoresSpeed;
    private Integer RAM;
    private Integer Storage;

    public ComputingDevice(String pName, Integer pCoresCount, Double pCoresSpeed, Integer pRAM, Integer pStorage) {
        this.Name=pName;
        this.CoresCount = pCoresCount;
        this.CoresSpeed = pCoresSpeed;
        this.RAM = pRAM;
        this.Storage = pStorage;
    }

    public String getName() {
        return Name;
    }

    public Integer getCoresCount() {
        return CoresCount;
    }

    public Double getCoresSpeed() {
        return CoresSpeed;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getStorage() {
        return Storage;
    }

    @Override
    public String toString() {
        return "Computing Device with name " + this.Name + "\n" +
                "Have:\n" +
                "CPU: " + this.CoresCount + " cores " + this.CoresSpeed + " GHz\n" +
                "RAM: " + this.RAM + "Gb\n" +
                "Storage: " + this.Storage + "Gb\n";
    }

    public String getTypeOfDevice(){
        return "Type: Unknown computing device";
    }
}
