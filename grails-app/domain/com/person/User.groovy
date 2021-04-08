package com.person

class User {

    def userName;
    def password;
    def typeUser; //0 for Shopper and 1 for Admin

    static constraints = {
        userName size: 3..10, blank: false, unique: true
        password size: 3..10, blank: false
    }
}
