import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {        // 메인함수
        // Q1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
        Scanner sc = new Scanner(System.in);        // 스캐너로 정보 받아옴

        String[] names = new String[10];            // 10명의 이름을 저장할 배열 생성
        
        for(int i = 0; i<names.length;i++)          // 변수 i는 0이고, i를 9까지 반복하며, 1씩 증가해라
            names[i] = sc.nextLine();               // 스캐너에서 이름 받아옴

        for(int i = 0; i<names.length;i++)          // 변수 i는 0이고, i를 9까지 반복하며, 1씩 증가해라
            System.out.print(names[i] + " ");       // 이름을 출력

        System.out.println();                       // 일단 넣어둠

    sc.close();
    }
}
