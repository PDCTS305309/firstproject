package com.learn.j8.j1.defaults;

public class Client123 implements Interface1, Interface2, Interface3 {

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA();
        client123.methodB();
        client123.methodC();
    }

    public void methodA() {
        System.out.println("Inside Method A: " + Client123.class);
    }
}
