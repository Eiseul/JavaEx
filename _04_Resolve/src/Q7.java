public class Q7 {
    public static void main(String[] args) {
        // Q7. do~while문을 이용해서 1부터 10까지 합을 출력하세요

        int num = 1;                    // 정수 선언
        int sum = 0;                    // sum 입력

        do {
            sum += num;
            num++;                      // 증가
        }
        while ( num <= 10 );            // 반복문 생성 (멈추는 조건)
        System.out.println("합은 " + sum);
    }
}
