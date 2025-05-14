public class Q4 {
    public static void main(String[] args) {
        // Q4. while문을 이용해서 1부터 10까지 중에 짝수를 출력하세요

        int num = 1;        // 숫자형 변수 설정

        while( num <= 10 ) { //숫자 10보다 작거나 같을때까지 반복해라
            if(num%2 == 0){                 // 만약 짝수일 경우
                System.out.println(num);    // 숫자 메시지 출력
            }
            num++;                      // +1   
        }                   // 입력->출력->증가 순으로 코드를 구성해야함. (예외O)
    }
}
