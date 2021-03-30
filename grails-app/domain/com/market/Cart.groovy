package com.market
import com.person.Client;

class Cart {

    public Client client;
    public Float value;
    
    static hasMany=[products: Produto]
    static constraints = {

    }
}
