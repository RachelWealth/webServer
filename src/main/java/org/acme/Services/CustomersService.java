package org.acme.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.acme.Models.Customer;
import org.acme.Models.DtuPayUser;

public class CustomersService {
    List<Customer> customers = new ArrayList<>(Arrays.asList(
        new Customer(1,"Yingli","cprnoYingli",1000.00,"account_noYingli","c"),
        new Customer(2,"Tama","cprnoTama",1000.00,"account_noTama","c"),
        new Customer(3,"Siyuan","cprnoSiyuan",1000.00,"account_noSiyuan","c"),
        new Customer(4,"Jiahe","cprnoJiahe",1000.00,"account_noJiahe","c"),
        new Customer(5,"Xinyi","cprnoXinyi",1000.00,"account_noXinyi","c"),


        new Customer(6,"202 coffee bar","CPR202CB", 2000.00,"account_no202CB","m"),
        new Customer(7,"101 coffee bar","CPR101CB", 3000.0,"account_no101CB","m"),
        new Customer(8,"202 canteen", "CPRCT",15000.00,"account_no202CT","m"),
        new Customer(9,"101 canteen","CPR101CT",500.00,"account_no101CT","m")
    ));

    public List<Customer> getAllCustomers(){
        return customers;
    }
    public boolean getCustomer(String bankAcc){
        Optional<Customer> opCustomers = customers.stream().filter(t->t.getBankAccount().equals(bankAcc)).findFirst();
        if(opCustomers.isPresent()){
            return true;
        }
        else{
            return false;
        }
    }
    public int addNewDtuPayUser(Customer newCustomer) {

        if (getCustomer(newCustomer.getBankAccount())){
            int nextId = customers.size() + 1;
            newCustomer.setId(nextId);
            customers.add(newCustomer);
            return nextId;
        }
        else {
            return -1;
        }
    }


    public Double getCustomerAccountBalance(String accountNumber) {
        Optional<Customer> opCustomers = customers.stream().filter(t->t.getBankAccount().equals(accountNumber)).findFirst();
        if(opCustomers.isPresent()){
            return opCustomers.get().getBalance();
        }
        else{
            return 0.0;
        }
    }

    public void changeAccountBalance(String customerBankAccount, Double currentBalanceC) {
//
        for(Customer element : customers){
            if (customerBankAccount.equals(element.getBankAccount()))
            {
              element.setBalance(currentBalanceC);
            }
        }
    }
}
