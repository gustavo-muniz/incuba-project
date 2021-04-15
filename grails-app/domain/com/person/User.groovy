package com.person

class User {

    String userName;
    String password;
    String typeUser; //0 for Shopper and 1 for Admin

    static constraints = {
        userName size: 3..10, blank: false, unique: true
        password size: 3..10, blank: false
    }
}
