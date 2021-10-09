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
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o== null || getClass() != o.getClass()) return  false;
        Test test = (Test) o;

        return i==test.i;
    }
    @Override
    public int hashCode(){
        return i;
    }
}
