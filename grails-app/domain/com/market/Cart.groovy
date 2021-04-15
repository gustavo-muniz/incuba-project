package com.market

class Cart {

    Float value;

    static hasMany = [products: Product]
    
    static constraints = {
        value min: 0
    }
}
