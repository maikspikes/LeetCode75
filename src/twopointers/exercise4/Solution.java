package twopointers.exercise4;

import java.util.Arrays;

class Solution {
    public static int maxOperations(int[] nums, int k) {

        /*
        If the array is sorted in ascending order, it allows you to take advantage of the ordering to efficiently
        narrow down your search for pairs. This is because if you know the current sum is smaller than k,
        you can increase the left pointer to consider larger values, and if the current sum is greater than k,
        you can decrease the right pointer to consider smaller values.
         */
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            //the array should shrink since the far right and far left numbers, give the result of k.
            // They can now be removed
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}