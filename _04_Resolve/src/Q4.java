public class Q4 {
    public static void main(String[] args) {
        //문제4 while문을 이용해서 1부터 10까지 중에 짝수를 출력하세요
        int num = 1;        // 숫자 설정 먼저

        while( num <= 10 ) {
            

            if(num%2 == 0){                 // 짝수일 경우
                System.out.println(num);    // 숫자 메시지 출력
                num++;                      // +1
            }
        }
    }
}
