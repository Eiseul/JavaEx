public class PearMain {
    public static void main(String[] args) {
        Mart mart = new Mart(2500, 10);
        Person me = new Person(5000);

        mart.sellPear(me, 5000);

        System.out.println(mart);
        System.out.println(me);
    }
}