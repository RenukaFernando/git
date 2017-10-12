package edu.uok.demo;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello World");
        A a = new A();

        for (int i = 0; i < 10; i++) {
            System.out.println(A.add(a.getX(), i));
        }
    }
}
