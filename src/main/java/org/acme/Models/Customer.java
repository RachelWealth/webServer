package org.acme.Models;

public class Customer {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Customer(){}
    public Customer(String id){
        this.id = id;
    }
    
}