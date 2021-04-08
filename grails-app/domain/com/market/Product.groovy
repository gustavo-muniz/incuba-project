package com.market

class Product {

    def name;
    def description;
    def value;
    def status; 

    static constraints = {
        name blank: false, unique: true
        description nullable: true, blank: true
        value min: 0
    }
}
