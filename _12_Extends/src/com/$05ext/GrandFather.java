package com.$05ext;

public class GrandFather {
    private int handsomeScore = 10;

    public int getHandsomeScore() {
        return this.handsomeScore;
    }

    public void setHandsomeScore(int handsomeScore) {
        this.handsomeScore = handsomeScore;
    }

    // 디폴트 생성자
    public GrandFather(){
        System.out.println("GrandFather 생성자");
    }

    public GrandFather(int score){
        this.handsomeScore = score;
        System.out.println("GrandFather 매개변수 생성자");
    }

    void handsome(){
        System.out.println("잘 생겼다~");
    }
}