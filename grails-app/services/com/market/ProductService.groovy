package com.market

import grails.gorm.transactions.Transactional

@Transactional
class ProductService {

    def create(def received){
        Product product = new Product();
        product.name = received.name;
        product.description = received.description;
        product.value = received.value;
        product.active = received.active;
        product.save();
        return[codereturn: 0, message:"Successful registration"]
    }
    def remove(def received){
        Product product = Product.findById(received.id);
        product.delete();
        return[codereturn: 0, message:"Successful deleted"]
       
    }
    def get(def received){
        Product product = Product.findById(received.id);
        return product;
    }
    def list(){
        def sqlcatalog= "SELECT name, description, value FROM product ORDER BY name ASC ";
        def result = query.rows(sqlcatalog);
        def names = [];
        def descriptions = [];
        def values = [];
        for(def product in result){
            names.add(product.name);
            descriptions.add(product.description);
            values.add(product.value);
        }
        def transfer = [names: names, descriptions: descriptions, values: values];
        return transfer;
    }
    def status(def product_id, def status){
        Product product = Product.findById(product_id);
        product.status = status;
        product.save();
        return product
    }
}
