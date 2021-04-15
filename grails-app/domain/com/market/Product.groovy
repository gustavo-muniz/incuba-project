package com.market

class Product {

    String name;
    String description;
    Float value;
    boolean status; 

    static constraints = {
        name blank: false, unique: true
        description nullable: true, blank: true
        value min: 0
    }
}
