public class FruitBuyer {
    private int money;
    private int numOfApple;

    public FruitBuyer(int money){
        this.money = money;
        this.numOfApple = 0;
    }

    public void buyApple(int count, int money){
        this.numOfApple += count;
        this.money -= money;
    }

    public void showBuyResult(){
        System.out.println("*** 과일 구매자의 현재 상황 ***");
        System.out.println("현재 잔액 : " + money);
        System.out.println("사과 개수 : " + numOfApple);
    }

    @Override
    public String toString() {
        return "잔액: " + money + ", 사과: " + numOfApple;
    }
}