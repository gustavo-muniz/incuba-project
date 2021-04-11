package com.market
import grails.converters.JSON;

class ProductsController {

    def index() { 
        def result = ProductService.list();
        render result as JSON
    }

    def show() {
        def received = request.JSON;
        def result = ProductService.get(received.id);
        render result as JSON
    }

    def store() {
        def received = request.JSON;
        def result = ProductService.create(received);
        render result as JSON
    }

    def destroy() {
        def received = request.JSON;
        def result = ProductService.remove(received.id);
        render result as JSON
    }
    def edit() {
        def received = request.JSON;
        def result = ProductService.edit(received.id);
        render result as JSON
    }
    def set_status() {
        def received = request.JSON;
        def result = ProductService.status(received);
        render result as JSON
    }
}
