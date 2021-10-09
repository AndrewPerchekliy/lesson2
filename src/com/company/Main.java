package com.company;
public class Main {
    public static void main(String[] args) {
    Test t = new Test();
    TestKeeper.printText();

    t.setI(5);

        System.out.println("Test value is:"+ t.getI());//5

    TestKeeper keeper = new TestKeeper();
    keeper.setT(t.clone());

        System.out.println("test value in keeper is:"+ keeper.getT().getI());//6
        System.out.println("test value in keeper is:"+ t.getI());//5
    }
}