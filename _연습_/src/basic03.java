import java.util.Scanner;

public class basic03 {
    public static void main(String[] args) {
        // 정수를 하나 입력받아서, 짝수인지 홀수인지 출력하는 프로그램
        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        }
    sc.close();
    }
}

