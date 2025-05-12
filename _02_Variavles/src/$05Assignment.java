public class $05Assignment {
    public static void main(String[] args) {
        int num = 1;
        // =(대입연산자) 기준으로 우측의 연산이 모두 끝나면 좌측으로 대입
        // 변수는 = 우측은 변수의 값을 의미
        // = 좌측은 변수의 저장 공간을 의미
        num = num + 1;
        System.out.println(num);        // num을 1증가
        num += 1;
        System.out.println(num);        // num을 1증가
        num++;
        System.out.println(num);        // num을 1증가
        ++num;
        System.out.println(num);        // num을 1증가
    }
}
