package com.khanz.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        String firstName, lastName;
        int ID;

        Scanner scanner = new Scanner(System.in);

        firstName = scanner.next();
        lastName = scanner.next();
        ID = scanner.nextInt();

        User user = new User(firstName, lastName, ID);

        user.showUser();
    }
}