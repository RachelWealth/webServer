package org.acme.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.acme.Models.Customer;

public class CustomersServices {
    List<Customer> customers = new ArrayList<>(Arrays.asList(
        new Customer("Yingli"),
        new Customer("Tama"),
        new Customer("Siyuan"),
        new Customer("Jiahe"),
        new Customer("Xinyi")
    ));

    public List<Customer> getAllCustomers(){
        return customers;
    }
    public  Customer getCustomer(String id){
        return customers.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
}
