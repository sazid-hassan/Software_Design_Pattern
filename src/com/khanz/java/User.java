package com.khanz.java;

public class User {
    public String firstName, lastName;

    public int ID;

    public User(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    //Methods

    public void showUser() {
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("ID : " + ID);
    }

}
