package com.market
import com.person.Client;
import com.enums.Status;

class Cart {

    public List<Product> products = new ArrayList<Product>();
    public Client client;
    public Float value;
    public Status status;
    
    static constraints = {
    }
}
