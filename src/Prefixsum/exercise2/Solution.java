package Prefixsum.exercise2;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;

        // this loop only adds the total sum to the sum variable
        for (int value : nums) {
            sum += value;
        }

        for (int i = 0; i < nums.length; ++i) {
            // if the leftSum == the same as sum - leftSum (wich is added after the loop if is not) - actual sum, we
            // found the pivot
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}