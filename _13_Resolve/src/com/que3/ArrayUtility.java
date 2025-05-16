package com.que3;

public class ArrayUtility {
    // int[] -> double[] 변환
    public static double[] intToDouble(int[] source){
        double[] result = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (double) source[i];
        }
        return  result;
    }
}
