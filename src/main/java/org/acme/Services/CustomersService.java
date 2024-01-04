package org.acme.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.acme.Models.Customer;

public class CustomersService {
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
    public Object getCustomer(String id){
        Optional<Customer> opCustomers = customers.stream().filter(t->t.getId().equals(id)).findFirst();
        if(opCustomers.isPresent()){
            return opCustomers.get();
        }
        else{
            return false;
        }
    }
    
   
}
