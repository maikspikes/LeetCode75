package slidingwindow.exercise1;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Initialize a variable to keep track of the sum of the current subarray.
        double sum = 0;

        // Iterate over the first 'k' elements of the 'nums' array
        for (int i = 0; i < k; i++) {
            //add the nums to sum, that start with index 0 and stop by k
            sum += nums[i];
        }

        //initialize a max sum to be divided later
        double maxAverage = sum / k; // Initialize maxAverage

        // Iterate through the rest of the 'nums' array, starting from index 'k'
        for (int i = k; i < nums.length; i++) {
            // Update 'sum' by subtracting the element that left the subarray and adding the new element
            /*
            At each step, nums[i - k] corresponds to the element that was at the beginning of the previous window.
            This element needs to be removed from the sum as it is no longer part of the current window,
            and the new element at index i needs to be added to the sum.
             */
            sum = sum - nums[i - k] + nums[i];

            // Update 'maxSum' to store the maximum sum encountered so far
            double currentAverage = sum / k; // Calculate current
            maxAverage = Math.max(maxAverage, currentAverage);
        }

        // Return the maximum average by dividing 'maxSum' by 'k'
        return maxAverage;
    }
}
