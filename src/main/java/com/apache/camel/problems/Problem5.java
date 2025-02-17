package com.apache.camel.problems;

//Merge two arrays by satisfying given constraints
//        Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
//        Input:
//
//        X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
//        Y[] = { 1, 8, 9, 10, 15 }
//
//        The vacant cells in X[] is represented by 0
//
//        Output:
//
//        X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }

import java.util.Arrays;
import java.util.List;

public class Problem5 {

    public static void main(String[] args) {
        int[] x = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] y = { 1, 8, 9, 10, 15 };
        Integer[] resultArray = new Integer[x.length];
        int count = 0;

        for(int i = 0; i < x.length; i++){
            if(x[i] != 0){
                continue;
            }
            else{
                x[i] = y[count];
                count++;
            }
        }

        Arrays.sort(x);
        for(int i = 0; i < x.length; i++){
            resultArray[i] = x[i];
        }

        System.out.println(List.of(resultArray));
    }

}
