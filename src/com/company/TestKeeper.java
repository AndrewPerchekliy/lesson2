package com.company;

public class TestKeeper {
    static public Test t;

    public static void printText() {
        System.out.println("same txt");
    }

    public Test getT() {
        return t;
    }
    public void setT(Test t){
        t.setI(t.getI() + 1);
        this.t=t;
    }
    @Override
    public  String toString() {
        return "Test{" +
                "t=" + t +
                '}';
    }
}