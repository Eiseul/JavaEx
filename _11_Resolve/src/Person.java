public class Person {
    int money;
    int pearCount;

    public Person(int money){
        this.money = money;
        this.pearCount = 0;
    }

    public void buyPear(int count, int money){
        this.pearCount += count;
        this.money -= money;
    }

    public String toString(){
            return  "나 - 가진 배 : " + pearCount + ", 남은 돈 : " + money;
    }
}
