public class $03Logic {
    public static void main(String[] args) {
        boolean isLogic = true && true;
        System.out.println(isLogic);
        isLogic = true && false;
        System.out.println(isLogic);
        isLogic = true || true;         // 쉬프트+\로 | 입력
        System.out.println(isLogic);
        isLogic = true || false;
        System.out.println(isLogic);
        System.out.println(!true);
        System.out.println(!false);
    }
}
