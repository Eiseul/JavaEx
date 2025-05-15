public class FruitSeller {
    private int numOfApple;         // 사과 개수
    private int saleMoney;          // 판매 수익
    final int APPLE_PRICE = 1000;   // 사과 가격 (상수)

    // 생성자: 초기 사과 개수만 설정
    public FruitSeller(int numOfApple){
        this.numOfApple = numOfApple;
        this.saleMoney = 0;  // 판매 수익은 처음엔 0원
    }

    // 사과 판매 메서드 (판매자가 중심)
    public void saleApple(FruitBuyer buyer, int money){
        int count = money / APPLE_PRICE;   // 몇 개를 팔 수 있는지 계산
        this.numOfApple -= count;          // 사과 개수 감소
        this.saleMoney += money;           // 판매 수익 증가

        buyer.buyApple(count, money);      // 구매자에게 사과 개수 전달
    }

    // 판매 결과 출력 메서드
    public void showSaleResult(){
        System.out.println("*** 과일 판매자의 현재 상황 ***");
        System.out.println("남은 사과 : " + numOfApple);
        System.out.println("판매 수익 : " + saleMoney);
    }

    // 객체 상태를 문자열로 표현할 때 사용
    @Override
    public String toString() {
        return "남은 사과: " + numOfApple + ", 수익: " + saleMoney;
    }
}
