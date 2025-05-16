package com.quen1;

public class Triangle {
    private double base;        //밑변
    private double height;      //높이

    // 생성자 : 객체 생성과 동시에 밑변, 높이 초기화
    public Traiangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    // 밑변 변경
    public void setBase(double base){
        this.base = base;
    }

    // 높이 변경
    public void setHeihgt(double height){
        this.height = height;
    }

    // 삼각형 넓이 계산
    public double getArea(){
        return ( base * height ) / 2;
    }

    // toString (출력용)
    @Override
    public String toString(){
        return "밑변 : " + base + ", 높이 : " + height + ", 넓이 : " + getArea(); 
    }
}
