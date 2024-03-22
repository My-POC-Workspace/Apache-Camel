package com.apache.camel.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5};
        List<Integer> resultList = new ArrayList<>();
        int resultValue = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    resultValue *= arr[j];
                }
            }
            resultList.add(resultValue);
            resultValue = 1;
        }
        System.out.println(resultList);

    }



}
