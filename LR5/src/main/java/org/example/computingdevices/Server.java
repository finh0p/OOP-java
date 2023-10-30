package org.example.computingdevices;

public class Server extends ComputingDevice{
    private Boolean inCluster;

    public Server(String pName, Integer pCoresCount, Double pCoresSpeed, Integer pRAM, Integer pStorage, Boolean pInCluster) {
        super(pName, pCoresCount, pCoresSpeed, pRAM, pStorage);
        this.inCluster = pInCluster;
    }

    public Double getTeraflops(){
        return super.getCoresSpeed() * 1000 * super.getCoresCount() / Math.pow(10, 6);
    }

    private String getInCluster(){
        return (this.inCluster) ? "Yes" : "No";
    }

    @Override
    public String toString() {
        String start = super.toString();
        return start +
                "In Cluster: " + this.getInCluster() + "\n" +
                "Speed CPU on Teraflops: " + this.getTeraflops() + " Tflops\n";
    }

    @Override
    public String getTypeOfDevice(){
        return "Type: Server";
    }
}
