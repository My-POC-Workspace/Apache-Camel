package com.apache.camel.problems;

//Print all subarrays with 0 sum
//        Given an integer array, print all subarrays with zero-sum.
//        For  example:
//        Input:  { 4, 2, -3, -1, 0, 4 }
//
//        Subarrays with zero-sum are
//
//        { -3, -1, 0, 4 }
//        { 0 }
//
//        Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
//
//        Subarrays with zero-sum are
//
//        { 3, 4, -7 }
//        { 4, -7, 3 }
//        { -7, 3, 1, 3 }
//        { 3, 1, -4 }
//        { 3, 1, 3, 1, -4, -2, -2 }
//        { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem3 {

    public static void main(String[] args) {
//        Integer[] arr = { 4, 2, -3, -1, 0, 4  };
//        Arrays.sort(arr);
//        List<Integer> listOfIntegers = Arrays.asList(arr);
//        List<Integer> listOfNegativeIntegers = new ArrayList<>();
//        List<Integer> listOfPositiveIntegers = new ArrayList<>();
//        Set<Integer> resultList = new HashSet<>();
//        System.out.println(listOfIntegers);
//        for(int i = 0; i < listOfIntegers.size(); i++){
//            if(listOfIntegers.get(0) >= 0){
//                System.out.println("No Subarray Can Be Form !!!");
//                break;
//            }
//
//            if(listOfIntegers.get(i) < 0){
//                listOfNegativeIntegers.add(listOfIntegers.get(i));
//            }
//            else {
//                listOfPositiveIntegers.add(listOfIntegers.get(i));
//            }
//
//        }

//        System.out.println("Positive Integer List :: " + listOfPositiveIntegers);
//        System.out.println("Negative Integer List :: " + listOfNegativeIntegers);
//        for (Integer i: listOfNegativeIntegers) {
//            if(listOfPositiveIntegers.contains(Math.abs(i))){
//                int positiveIntegerIndex = listOfPositiveIntegers.indexOf(Math.abs(i));
//                System.out.println("SubArray :: { " + i + ", " + listOfPositiveIntegers.get(positiveIntegerIndex) + " }");
//            }
//            else if(listOfPositiveIntegers.contains(Math.abs(listOfNegativeIntegers.stream().mapToInt(Integer::intValue).sum()))) {
//                int abs = Math.abs(listOfNegativeIntegers.stream().mapToInt(Integer::intValue).sum());
//                int positiveIntegerIndex = listOfPositiveIntegers.indexOf(abs);
//                resultList.add(i);
//                resultList.add(listOfPositiveIntegers.get(positiveIntegerIndex));
////                System.out.println("SubArray :: { " + i + ", " + listOfPositiveIntegers.get(positiveIntegerIndex) + " }");
//            }
//        }
//        System.out.println("ResultList :: " + resultList);



        //Print all subarrays with 0 sum
        //Given an integer array, print all subarrays with zero-sum.
        //For  example:
        //Input:  { 4, 2, -3, -1, 0, 4 }

        //Subarrays with zero-sum are
        //
        //{ -3, -1, 0, 4 }
        //{ 0 }


        //Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
        //
        //Subarrays with zero-sum are
        //
        //{ 3, 4, -7 }
        //{ 4, -7, 3 }
        //{ -7, 3, 1, 3 }
        //{ 3, 1, -4 }
        //{ 3, 1, 3, 1, -4, -2, -2 }
        //{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

        int[] nums = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int[] arr = new int[nums.length];
            int f = 0;
            arr[f] = nums[i];
            sum += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                f++;
                arr[f] = nums[j];
                sum += nums[j];
                if (sum == 0) {
                    IntStream intStream = Arrays.stream(arr).filter(s -> s != 0);
                    System.out.println(Arrays.toString(intStream.toArray()));

                }
            }
        }
    }
}