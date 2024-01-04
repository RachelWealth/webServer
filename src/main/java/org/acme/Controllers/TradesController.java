package org.acme.Controllers;


import java.util.List;

// import org.acme.Exceptions.MerchantNotExistException;
import org.acme.Models.Trade;
import org.acme.Services.TradesService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/simpleDTUPay")
public class TradesController {
    
    //private static final Exception MerchantNotExistException = null;
    private TradesService tradesService = new TradesService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/plain")
    public void addNewTrades(Trade trade) /*throws MerchantNotExistException*/{
        // if(false){
        //     throw new MerchantNotExistException;
        // }
        tradesService.addTrade(trade);

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Trade> getAllTrades(){
        return tradesService.getAllTrades();
    }
}
