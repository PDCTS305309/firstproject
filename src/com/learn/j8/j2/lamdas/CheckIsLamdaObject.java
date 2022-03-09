package com.learn.j8.j2.lamdas;

import java.util.Comparator;
import java.util.function.Consumer;

public class CheckIsLamdaObject {

    public static void main(String[] args) {
        showComparator();
        showRunnable();
    }

    public static void showComparator() {
        Comparator<Person> c = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        Comparator<Person> c1 = (x, y) -> Integer.compare(x.getAge(), x.getAge());

    }

    public static void showRunnable() {
        Consumer<String> sleep = (name) -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Error occurred executing : " + name);
                e.printStackTrace();
            }
        };
        //Thread-1
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Running-1");
                sleep.accept(Thread.currentThread().getName());
            }
        };
        System.out.println(r);
        new Thread(r).start();

        //Thread-2
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Running-2");
                sleep.accept(Thread.currentThread().getName());
            }
        }).start();

        //Thread-3
        Runnable r1 = () -> {
            System.out.println(Thread.currentThread().getName() + " Running-3");
            sleep.accept(Thread.currentThread().getName());
        };
        System.out.println(r1);
        new Thread(r1).start();

        //Thread-4
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " Running-4");
            sleep.accept(Thread.currentThread().getName());
        }).start();
    }
}


class Person {
    private int id;
    private String name;
    private int age;
    private String address;

    public int getAge() {
        return age;
    }
}