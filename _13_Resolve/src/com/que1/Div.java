package com.que1;

public class Div {
    private int a, b;

    public void setValue(int _a, int _b){
        this.a = _a;
        this.b = _b;
    }

    public int calculate(){
        if ( b == 0 ) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return a / b;
    }
}
