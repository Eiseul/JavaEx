import java.util.Scanner;

public class $03Method {

    public static int calcArith(String op, int num0, int num1){
        int result = 0;

        switch(op){
            case "+":
                result = num0 + num1;
                break;
            case "-":
                result = num0 - num1;
                break;
            case "*":
                result = num0 * num1;
                break;
            case "/":
                result = num0 / num1;
                break;
            case "%":
                result = num0 % num1;
                break;
            default:
                System.out.println("연산이 불가능합니다.");
                break;
        }
        
        return result;
    }


    public static void viewResult(Scanner sc, int result){
        System.out.println("결과값은 " + result + "입니다.");
    }

    public static int inputNum(int order1){
        System.out.print("번째 정수 입력 >> ");
        int num = sc.nextInt();
        return num;
    }

    public static int inputNum(int order2){
        System.out.print("연산자 입력(+ - * / %) >> ");
        int num = sc.next();
        return num;
    }
    

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int num0 = inputNum(sc, order1);
        int num1 = inputNum(sc, order2);
        System.out.print("연산자 입력(+ - * / %) >> ");
        String op = sc.next();
        int result = 0;

        result = calcArith(op, num0, num1);     // 사칙 연산
        viewResult(result);                     // 결과 출력

        sc.close();
    }
}