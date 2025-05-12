public class Q3 {
    public static void main(String[] args) {

        //문제3 주석
        int num = 1;    // 숫자 설정 먼저
        int sum = 0;
       
        while( num <= 10 ) {
            // num이 10이하면 반복
            // num이  되면서 10번 반복된다.
            sum += num;
            num++;
        }
        
        System.out.println(sum);
    }
}
