package com.market
import com.enums.Active;

class ProductsController {

    def index() { }

    def listProducts(){
        def result = ProductService.list();
        render result as JSON
    }

    def saveProduct(){
        def received = request.JSON;
        def result = ProductService.register(received);
        render result as JSON
    }

    def removeProduct(){
        def received = request.JSON;
        def result = ProductService.remove(received);
        render result as JSON
    }
    def editProduct(){
        def received = request.JSON;
        def result = ProductService.edit(received);
        render result as JSON
    }
    def searchProduct(){
        def received = request.JSON;
        def result = ProductService.search(received);
        render result as JSON
    }
    def activateProduct(){
        def received = request.JSON;
        def result = ProductService.active(received);
        render result as JSON
    }

    def disableProduct(){
        def received = request.JSON;
        def result = ProductService.disable(received);
        render result as JSON 
    }
    def listActivedsProducts(){
        def result = ProductService.listActive();
        render result as JSON 
    }

}
