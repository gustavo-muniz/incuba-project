package com.market
import com.enums.Active;

class ProductsController {

    def index() { 
        def result = ProductService.list();
        render result as JSON
    }

    def store(){
        def received = request.JSON;
        def result = ProductService.register(received);
        render result as JSON
    }

    def destroy(){
        def received = request.JSON;
        def result = ProductService.remove(received);
        render result as JSON
    }
    def edit(){
        def received = request.JSON;
        def result = ProductService.edit(received);
        render result as JSON
    }
    def set_status(){
        def received = request.JSON;
        def result = ProductService.status(received);
        render result as JSON
    }
}
