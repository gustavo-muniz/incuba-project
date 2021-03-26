package com.person

class ClientsController {

    def index() { }

    public static void form(){
        render();
    }

    public static void editClient(Long id){
        Client client = Client.findById();
        render("Clients/form.html", client);
    }

    public static void listClients(){
        List<Client> clients = Client.findAll();
        render(clients);
    }

    public static void saveClient(Client client){
        client.save();
        listClients();
    }

    public static void removeClient(Long id){
        Client client = Client.findById(id);
        client.delete();
    }
}
