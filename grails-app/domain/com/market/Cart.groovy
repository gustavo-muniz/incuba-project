package com.market
import com.person.Client;
import com.enums.Status;

class Cart {

    List<Product> products = new ArrayList<Product>();
    Client client;
    Float value;
    Status status;
    
    static constraints = {
    }
}
