package org.acme.Models;

public class Merchant {
    private  String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Merchant(){}

    public Merchant(String id){
        this.id=id;
    }

}
