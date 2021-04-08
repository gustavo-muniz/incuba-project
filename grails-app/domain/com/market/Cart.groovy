package com.market

class Cart {

    def value;

    static hasMany=[products: Product]
    
    static constraints = {
        value min: 0
    }
}
