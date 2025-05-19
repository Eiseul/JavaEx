package com.$04interface.factory;           // 현재 내 패키지 경로
// 다른 패키지의 선언을 접근할 때 (다른 패키지에 접근하겠다)

import com.$04interface.order.ParentCar;

public class FordCar extends ParentCar {

    @Override
    public void turnOn() {  
        System.out.println(this.getClass() + " -  The engine start well~");   // 현재 클래스 정보를 얻어내는 메서드
        delay();
    }

    @Override
    public void turnOff() {
        System.out.println(this.getClass() + " -  The Start-off works well~");
        delay();
    }

    @Override
    public void accel() {
        System.out.println(this.getClass() + " -  The acceleratot accelerates well~");
        delay();
    }

    @Override
    public void footBreak() {
        System.out.println(this.getClass() + " -  Have a good brake stop well~");
        delay();
    }

}
