package org.example;

public class Main {

    public String sayHello() {
        return "Hello from CS 415!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sayHello());
        System.out.println("sum of a and b = " + main.add(10, 3));
        System.out.println("Is the entered number even? " + main.isEven(11));
        System.out.println("multiplication of a and b = " + main.multiply(7, 7));
    }
}