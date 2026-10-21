package com.example;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Java CI/CD Application Started...");

        while (true) {
            Thread.sleep(5000);
            System.out.println("Hello from Java CI/CD Pipeline!");
        }
    }
}