package org.acme.Models;

public class Trade {
    private String id;
    private String customerId;
    private String merchantId;
    
    private int price;
    public Trade(){}
    public Trade(String id, String customerId, String merchantId, int price) {
        this.customerId = customerId;
        this.merchantId = merchantId;
        this.id = id;
        this.price = price;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getMerchantId() {
        return merchantId;
    }
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }




}
