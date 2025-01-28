package org.example.dynamic_programming;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        maximumSubarray.maxSubArray(nums);
    }

    //time limit exceeded
//    public int maxSubArray(int[] nums) {
//        int maxSubarray = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int currentSubarray = 0;
//            for (int j = i; j < nums.length; j++) {
//                currentSubarray += nums[j];
//                maxSubarray = Math.max(maxSubarray, currentSubarray);
//            }
//        }
//        return maxSubarray;
//    }



    public int maxSubArray(int[] nums) {
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        // Start with the 2nd element since we already used the first one.
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }

        return maxSubarray;
    }
}
