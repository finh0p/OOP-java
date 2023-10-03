package org.example;

public class Client {
    protected static Integer lastInd = 0;
    protected Integer id;
    protected String name;

    private Client(String n){
        this.id = ++Client.lastInd;
        this.name = n;
    }

    private static Client createClient(String n){
        Client c = new Client(n);
        ClientBase.addClient(c);
        return c;
    }

    public static Client getClient(Integer id, String name){
        if (!ClientBase.checkExistedById(id)){
            return Client.createClient(name);
        }
        return ClientBase.getClientById(id);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Integer getLastInd(){
        return Client.lastInd;
    }

    @Override
    public String toString() {
        return "id: " + this.getId().toString() + " Name: " + this.getName();
    }
}
