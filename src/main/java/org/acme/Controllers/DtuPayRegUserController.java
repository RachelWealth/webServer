package org.acme.Controllers;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import org.acme.Models.Customer;
import org.acme.Models.DtuPayUser;
import org.acme.Models.Trade;
import org.acme.Services.CallBankAuthService;
import org.acme.Services.RegDtuPayUserService;

import dtu.ws.fastmoney.BankServiceException_Exception;

import java.util.List;

@Path("/dtupayreg")
public class DtuPayRegUserController {
    private RegDtuPayUserService dtuPayUserService = new RegDtuPayUserService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DtuPayUser> listRegDtuPayUser(){
        return dtuPayUserService.getAllDtuPayUser();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public int regDtuPayUser(DtuPayUser dtuPayUser){
        
        return dtuPayUserService.addNewDtuPayUser(dtuPayUser);
    }

     /*************DO NOT CALL this ANY MORE *******************/
    // @GET
    // @Path("/createnewusers")
    // @Produces(MediaType.APPLICATION_JSON)
    // public List<String> createNewBankAccount() throws BankServiceException_Exception{
    //     CallBankAuthService bank = new CallBankAuthService();
    //     List<String> rt = bank.CreateAccount();
    //     return rt;
    // }
    
    @POST
    @Path("/validAccount")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String validAccountExample(String accountId) throws BankServiceException_Exception{
        CallBankAuthService bank = new CallBankAuthService();
        return String.valueOf(bank.validAccount(accountId));
    }
    


}
