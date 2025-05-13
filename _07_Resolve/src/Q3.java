import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
    // Q3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요

    Scanner sc = new Scanner(System.in);        // 스캐너 로드

    String[] name = new String[7];               // 배열생성
    
    int[] kor = new int[7];
    for(int i=0;i<3;i++){
        System.out.println((i+1) + "번째 학생 점수 입력 >> ");
    kor[i] = sc.nextInt();
    }

    int total = 0;
    for(int i=0;i<7;i++){
        total += kor[i];
    }
    double avg = (double)total/3;


    System.out.println("총점 : " + total);
    System.out.println("평균 : " + avg);
    System.out.printf("평균: %.2f\n", avg);

    sc.close();
}
}
