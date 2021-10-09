package com.company;

public class Main {

    public static void main(String[] args) {
    Test t1 = new Test();
    t1.setI(2);

    Test t2=t1;

    System.out.println(t2.getI());

    t2.setI(5);

    System.out.println(t1.getI());

    }
}
