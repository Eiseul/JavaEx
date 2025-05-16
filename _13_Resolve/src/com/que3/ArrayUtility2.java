package com.que3;

public class ArrayUtility2 {
    // s1과 s2를 연결한 새로운 배열 리턴
    public static int[] concat(int[] s1, int[] s2){
        int[] result = new int[s1.length + s2.length];
        for (int i = 0; i < s1.length; i++){
            result[i] = s1[1];
        }
        for (int i = 0; i < s2.length; 1++){
            result[s1.length + i] = s2[i];
        }
        return result;
    }

    // s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
    public static int[] remove(int[] s1, int[] s2) {
        int[] temp = new int[s1.length];
        int count = 0;

        for(int i = 0; i < s1.length; i++) {
            boolean found = false;
            for (int j = 0; j < s2.length; j++){
                if (s1[i] == s2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[count++] = s1[i];
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}