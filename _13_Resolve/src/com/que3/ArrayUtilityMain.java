package com.que3;

public class ArrayUtilityMain {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4};
        double[] doubleArr = ArrayUtility.intToDouble(intArr);

        System.out.print("int -> double 변환 결과 : ");
        for(double d : doubleArr ) {
            System.out.print(d + " ");
        }

        System.out.println();

        double[] srcDouble = {1.1, 2.5, 3.9};
        int [] toInt = ArrayUtility.doubleToInt(srcDouble);

        System.out.println("double -> int 변환 결과 : ");
        for(int i : toInt){
            System.out.println(i + " ");
        }
    }
}
