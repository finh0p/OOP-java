package org.example;

public class Note {
    protected Client client;
    protected Product product;
    protected Integer count;
    protected Condition condition;

    public Note(Integer id, String name, Product product, Integer count, Condition condition){
        this.client = Client.getClient(id, name);
        this.product = product;
        this.count = count;
        this.condition = condition;
    }

    public Condition getCondition() {
        return this.condition;
    }

    public Integer getCount() {
        return this.count;
    }

    public Product getProduct() {
        return this.product;
    }

    public Client getClient() {
        return this.client;
    }

    public void setCount(Integer count) {
        if (this.condition == Condition.InProcess) {
            this.count = count;
        }
    }

    public void setCondition(Condition condition) {
        if (this.condition == Condition.InProcess) {
            this.condition = condition;
        }
    }

    public Integer getAmount(){
        return Main.getPrice(this.product) * this.count;
    }
}
