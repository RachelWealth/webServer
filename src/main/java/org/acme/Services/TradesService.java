package org.acme.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.acme.Models.Customer;
import org.acme.Models.Trade;

import io.netty.handler.codec.ByteToMessageDecoder.Cumulator;

public class TradesService {
    List<Trade> trades = new ArrayList<>(Arrays.asList(
        new Trade("1", "Yingli","101 coffee bar",32),
        new Trade("2","Tama","202 canteen",30),
        new Trade("3","Jiahe","101 canteen",50),
        new Trade("4","Siyuan","202 coffee bar",55),
        new Trade("5","Xinyi","202 canteen",45)
    ));
    CustomersService customersService = new CustomersService();
    private int total=5;

    private void addTotal(){
        this.total+=1;
    }
    // public int getTotal(){
    //     return this.total;
    // }
    public void addTrade(Trade trade){
        addTotal();
        Trade newTrade = new Trade(String.valueOf(this.total),trade.getCustomerId(),trade.getMerchantId(),trade.getPrice());
        trades.add(newTrade);
        this.addTotal();
    }

    public List<Trade> getAllTrades(){
        return trades;
    }
    public Boolean checkCustomer(String id){
        Object rt = customersService.getCustomer(id);
        if(rt instanceof Boolean){
            
            return false;
        }else{
            return true;
        }
    }
    
}
