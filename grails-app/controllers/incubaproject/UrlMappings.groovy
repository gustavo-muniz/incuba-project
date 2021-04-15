package incubaproject

class UrlMappings {

    static mappings = {
        
        get "/products"(controller: "products", action: "index")
        post "/products"(controller: "products", action: "store")
        get "/products/$id"(controller: "products", action: "show")
        delete "/products/$id"(controller: "products", action: "destroy")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
