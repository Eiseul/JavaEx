import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {        // 메인함수
        // Q2. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요 (역순)
        Scanner sc = new Scanner(System.in);        // 스캐너 불러오기

        String[] names = new String[10];           // 배열 생성
        
        for(int i = 0; i<names.length;i++)
            names[i] = sc.nextLine();               // 명단 받아오기

        for(int i = 9;i >= 0; i--)
            System.out.print(names[i] + " ");       // 명단 출력

        System.out.println();                       // 출력

    sc.close();
    }
}
