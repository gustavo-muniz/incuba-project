package com.market
import com.enums.Active;

class ProductsController {

    def index() { }

        public static void editProduct(Long id){
        Product product = Product.findById();
        render("Products/form.html", product);
    }

    public static void listProducts(){
        List<Product> products = Product.findAll();
        render(products);
    }

    public static void saveProduct(Product product){
        product.save();
        listProducts();
    }

    public static void removeProduct(Long id){
        Product product = Product.findById(id);
        product.delete();
    }

    public static void activateProduct(Long id){
        Product product = Product.findById(id);
        product.active = Active.ON;
    }

    public static void disableProduct(Long id){
        Product product = Product.findById(id);
        product.active = Active.OFF; 
    }
    public static void listActivedsProducts(){
        List<Product> products = Product.findAll();
        List<Product> activedsProducts = products.stream().filter({product -> product.active.equals(Active.ON)});
        render("Client/catalog.html", activedsProducts);
    }

}
