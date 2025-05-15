public class FruitMain {
// public = 다른 곳에서도 사용할 수 있도록 공개 범위를 넓힘. 어디서든 접근 가능

    public static void main(String[] args) { // <= 자바 프로그램의 시작점
// static = 객체 생성없이 바로 실행 가능 / void = 값을 리턴하지 않는 메서드

        FruitSeller seller = new FruitSeller(30); 
        // FruitSeller = 판매자 클래스 (자료형)
        // seller = 판매자 객체 이름
        /* new FruitSeller(30) = 생성자 호출.
        FruitSeller 클래스의 생성자를 실행해서 사과 30개 가진 판매자 생성*/

        FruitBuyer buyer = new FruitBuyer(5000); 
        // FruitBuyer = 구매자 클래스 (자료형)
        // buyer = 구매자 객체 이름
        /* new FruitBuyer(5000) = FruitBuyer 클래스의 생성자 호출
         * 돈 5000원을 가진 구매자 객체가 생성됨
         */

        seller.saleApple(buyer, 2000);     
        // 판매자 객체(seller)의 saleApple() 메서드를 호출
        // buyer = 사과를 살 구매자 객체
        // 2000 = 구매자가 내는 돈

        /* 이 메서드가 하는 일
         * 1. 2000원어치 사과 개수를 계산함 ( 가격은 1000원 -> 2개 )
         * 2. 판매자 사과 개수 차감
         * 3. 판매자 수익 증가
         * 4. 구매자에게 buyApple(개수, 금액) 메서드 호출해서 사과 넘겨줌*/

        System.out.println("판매자 : " + seller);    // 판매자 상태 출력
        // 판매자의 상태를 출력함.
        // seller 객체를 출력하려면 FruitSeller 클래스에 toString() 메서드가 있어야 함.
        // ex) 남은 사과: 28, 수익: 2000

        System.out.println("구매자 : " + buyer);     // 구매자 상태 출력
        // 구매자의 상태를 출력함.
        // buyer 객체의 toString() 메서드가 실행됨.
        // ex) 사과: 2, 잔액: 3000
    }
}
