package org.acme.Models;

/**
 * Need to update: CPR as new id, previously, name is my id
 * 
 */
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
