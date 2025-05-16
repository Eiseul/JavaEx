package com.quen1;

public class TriangleTest {
    public static void main(String[] args) {
        // 객체 생성과 동시에 초기화
        Triangle tri = new Triangle(10, 5);

        // 출력
        System.out.println("삼각형 넓이: " + tri.getArea());

        // 값 변경
        tri.setBase(20);
        tri.setHeight(8);

        // 다시 출력
        System.out.println("변경 후 삼각형: " + tri);
    }
}
