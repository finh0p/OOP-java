package org.example.computingdevices;

public class SelfHostServer extends Server{
    String domainName;
    public SelfHostServer(String pName, Integer pCoresCount, Double pCoresSpeed, Integer pRAM, Integer pStorage, Boolean pInCluster, String pDomainName) {
        super(pName, pCoresCount, pCoresSpeed, pRAM, pStorage, pInCluster);
        this.domainName = pDomainName;
    }

    public String getDomainName() {
        return domainName;
    }

    @Override
    public String toString(){
        String res = super.toString();
        return res +
                "Domain name: " + this.domainName + "\n";
    }
}
