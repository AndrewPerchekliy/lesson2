package com.company;

public class TestKeeper {
    Test t;

    public Test getT() {
        return t;
    }

    public void setT(Test t){
        t.setI(t.getI() + 1);
        this.t=t;
    }
}

