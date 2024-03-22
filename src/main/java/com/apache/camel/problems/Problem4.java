package com.apache.camel.problems;

//        Sort an array of 0’s, 1’s, and 2’s (Dutch National Flag Problem)
//        Given an array containing only 0’s, 1’s, and 2’s, sort it in linear time and using constant space.
//        For Example:
//        Input:  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }
//
//        Output: { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 }

public class Problem4 {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        int low = 0, mid = 0, high = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[mid] == 0){
                low += 1;
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low += 1;
                mid += 1;
            } else if (nums[mid] == 1) {
                mid += 1;
            }
            else if(nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[mid] = temp;
                high -= 1;
            }
        }

        for (int i: nums){
            System.out.print(i + ", ");
        }
    }
}
