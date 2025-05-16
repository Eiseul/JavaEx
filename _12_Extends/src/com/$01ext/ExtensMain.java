package _12_Extends.src.com.$01ext;

public class ExtensMain {
    public static void main(String[] args) {
        Father fa = new Father();
        fa.handsome();
        fa.wealth();

        Child ch = new Child();
        ch.handsome();
        ch.wealth();
        ch.play();
    }
}
