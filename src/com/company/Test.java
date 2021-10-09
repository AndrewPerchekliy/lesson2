package com.company;

public class Test {
    int i;

    public int getI() {
        return i;
    }
    public void setI(int i){

        this.i=i;
    }
    @Override
    protected Test clone(){
        Test test = new Test();
        test.setI(this.i);
        return test;
    }
}
