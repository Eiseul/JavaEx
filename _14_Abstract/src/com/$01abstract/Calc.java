package com.$01abstract;

/* 추상 클래스
; 추상 메서드를 1개 이상 포함한 클래스

  추상 메서드
; 현재 클래스에서는 구현 정의를 하지 않고
상속을 통해서 자식 클래스에서 구현되도록 선언부만 정의한 것
 */

public abstract class Calc {
    proected int a, b;

    public void setValue(int a, int b);{
        this.a = a;
        this.b = b;
    }
    public abstract int calculate();
}
