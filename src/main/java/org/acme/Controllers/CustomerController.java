package org.acme.Controllers;

import org.acme.Models.Customer;
import org.acme.Services.CallBankAuthService;
import org.acme.Services.CustomersService;

import dtu.ws.fastmoney.BankServiceException_Exception;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerController {
    CustomersService customersService = new CustomersService();
    
    @GET
    @Path("/register/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String createNewCustomer(@PathParam("id") String id){
        return "test";
    }
    /*
     * Here only used for test
     */
    
    @POST
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Boolean validUserAccount(@PathParam("id") String id) throws BankServiceException_Exception{
        CallBankAuthService bService = new CallBankAuthService();
        return bService.validAccount(id);
    }
}
