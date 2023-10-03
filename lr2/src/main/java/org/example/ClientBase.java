package org.example;

import java.util.HashMap;

public class ClientBase {
    protected static HashMap<Integer, Client> base = new HashMap<Integer, Client>();

    public static void addClient(Client c){
        ClientBase.base.put(c.getId(), c);
    }

    public static Boolean checkExistedById(Integer id){
        Client c = ClientBase.base.get(id);
        if (c == null) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static Client getClientById(Integer id){
        return ClientBase.base.get(id);
    }
}
