package org.acme.Controllers;

import org.acme.Services.CustomersService;
import org.jboss.logging.annotations.Producer;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;


public class CustomerController {
    CustomersService customersService = new CustomersService();
    @Path("/customer/register")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    private void register(){
        
    }

}
