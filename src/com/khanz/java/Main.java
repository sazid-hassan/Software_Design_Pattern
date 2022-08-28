package com.khanz.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        User user = new User();

        Scanner scanner = new Scanner(System.in);

        user.firstName = scanner.next();
        user.lastName = scanner.next();
        user.ID = scanner.nextInt();

        System.out.println("Name : " + user.firstName + " " + user.lastName);
        System.out.println("ID : " + user.ID);
    }
}