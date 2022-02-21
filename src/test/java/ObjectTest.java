package test.java;

import main.java.utils.Orderable;

public class ObjectTest implements Orderable {

    private int num;

    ObjectTest(int num) {
        this.num = num;
    }

    @Override
    public int getValue() {
        // TODO Auto-generated method stub
        return num;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
    }
}
