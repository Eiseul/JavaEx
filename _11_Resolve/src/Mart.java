public class Mart {
    int pearPrice;
    int pearCount;
    int money;

    public Mart(int pearPrice, int pearCount){
        this.pearPrice = pearPrice;
        this.pearCount = pearCount;
        this.money = 0;
    }

    public void sellPear(Person buyer, int money){
        int count = money / pearPrice;
        pearCount -= count;
        this.money += money;

        buyer.buyPear(count, money);
    }

    public String toString(){
        return "마트 - 남은 배 : " + pearCount + ", 번 돈 : " + money;
    }
}
