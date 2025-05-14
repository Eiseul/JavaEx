public class Q6 {
    public static void main(String[] args) {
        // Q6. do~while문을 이용해서 10부터 20까지 출력하세요         = 조건을 나중에 검사하는 반복문
        
        int num = 10;        // 숫자 선언

        do {
            System.out.println(num);        //출력
            num++;                          //증가
        }
        while ( num <= 20 );                //조건
    }
}
