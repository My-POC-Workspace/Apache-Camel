package com.apache.camel.problems;

//        Find a pair with the given sum in an array.
//        Given an unsorted integer array, find a pair with the given sum in it.
//        For Example:
//        Input:
//        nums = [8, 7, 2, 5, 3, 1]
//        target = 10
//        Output:
//        Pair found (8, 2)
//        or
//        Pair found (7, 3)
//        Input:
//        nums = [5, 2, 6, 8, 1, 9]
//        target = 12
//        Output: Pair not found

public class Problem1 {

    public static void main(String[] args) {
        Integer[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        int currentElement = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j)
                    continue;
                else if(arr[i] + arr[j] == target)
                    System.out.println("Pair found (" + arr[i] + ", " + arr[j] + ")");
            }
        }

//        while (currentElement < arr.length) {
//            for (int i = 1; i < arr.length; i++) {
//                if(currentElement == i)
//                    continue;
//                if (arr[i] + arr[currentElement] == target)
//                    System.out.println("Pair found (" + arr[i] + ", " + arr[currentElement] + ")");
//            }
//            currentElement += 1;
//        }


    }

}
