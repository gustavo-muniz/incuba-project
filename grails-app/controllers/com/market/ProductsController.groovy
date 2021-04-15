package com.market
import grails.converters.JSON;

class ProductsController {

    def productService;
    
    static allowedMethods = [ index: "GET", 
        show: "GET", 
        store: "POST",
        destroy: "DELETE",
        edit: "PATCH",
        set_status: "PATCH"
    ]

    def index() { 
        def result = productService.list();
        render result as JSON
    }

    def show() {
        def received = request.JSON;
        def result = productService.get(received.id);
        render result as JSON
    }

    def store() {
        def received = request.JSON;
        def result = productService.create(received);
        render result as JSON
    }

    def destroy() {
        def received = request.JSON;
        def result = productService.remove(received.id);
        render result as JSON
    }
    def edit() {
        def received = request.JSON;
        def result = productService.edit(received.id);
        render result as JSON
    }
    def set_status() {
        def received = request.JSON;
        def result = productService.status(received);
        render result as JSON
    }
}
