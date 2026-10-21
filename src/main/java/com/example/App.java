
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Java CI/CD Application Started...");

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Program Exited: Status Code 200 OK");
                Thread.currentThread().interrupt();
                break;
            }
            System.out.println("Hello from Java CI/CD Pipeline!");
        }
    }
}
