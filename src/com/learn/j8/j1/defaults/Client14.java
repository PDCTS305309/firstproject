package com.learn.j8.j1.defaults;

public class Client14 implements Interface1, Interface4 {

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }

    @Override
    public void methodA() {
        System.out.println("Inside Method A: " + Client14.class);
    }
}
