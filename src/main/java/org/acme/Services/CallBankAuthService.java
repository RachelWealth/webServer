package org.acme.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.acme.Models.Customer;

import dtu.ws.fastmoney.Account;
import dtu.ws.fastmoney.BankService;
import dtu.ws.fastmoney.BankServiceException_Exception;
import dtu.ws.fastmoney.BankServiceService;

public class CallBankAuthService {
    BankService bank = new BankServiceService().getBankServicePort();
    
    List<Customer> cfakeAccount = new ArrayList<>(Arrays.asList(
        new Customer(1,"CPRYingli", "Yingli",1000,null,"c"), //No one can be richer than me :)
        new Customer(2,"CPRSiyuan","Siyuan",500,null,"c"),
        new Customer(3,"CPRTama","Tama",600,null,"c"),

        new Customer(4,"CPR101 coffee bar","101 coffee bar",0,"m"), //DTU is so poor
        new Customer(5,"CPR101 canteen","101 canteen",0,"m"),
        new Customer(6,"CPR202 canteen","202 canteen",0,"m")
    ));

    

    public CallBankAuthService(){
        for(int i=0;i<cfakeAccount.size();i++){
            String bankAccount = bank.createAccountWithBalance(cfakeAccount.get(i).getCPR(), cfakeAccount.get(i).getBalance());
            cfakeAccount.get(i).setBankAccount(bankAccount);
        }
    }
    /**
     * MUST DO, to make sure we can reuse the bank account in our test
     */
    public void retireBankAccount(){
        for(int i=0;i<cfakeAccount.size();i++){
            bank.retireAccount(cfakeAccount.get(i).getBankAccount());
        }
    }
   
    public Boolean validAccount(String id) throws BankServiceException_Exception{
        Account rt =bank.getAccount(id);
        System.out.println(rt);
        return true;
    }
    
}
