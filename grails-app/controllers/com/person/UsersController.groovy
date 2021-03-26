package com.person

class UsersController {

    def index() { }

    public static void form(){
        render();
    }
    public static void editUser(Long id){
        User user = User.findById(id);
        render("Users/form.html", user);
    }

    public static void listUsers(){
        List<User> users = User.findAll();
        render(users);
    }

    public static void saveUser(User user){
        user.save();
    }

    public static void removeUser(Long id){
        User user = User.findById(id);
        user.delete();
        listUsers();
    }

    

}
