package slidingwindow.exercise4;

class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;                    // Left boundary of the subarray
        int maxSubarrayLength = 0;       // Length of the longest subarray with only 1's
        int deleteCount = 0;             // Count of 0's encountered

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                deleteCount++;            // Increment deleteCount for encountered 0
            }

            while (deleteCount > 1) {    // While more than one deletion needed
                if (nums[left] == 0) {
                    deleteCount--;        // Decrement deleteCount for 0 to be deleted
                }
                left++;                   // Move left boundary to the right
            }

            int currentLength = right - left + 1;  // Calculate current subarray length
            maxSubarrayLength = Math.max(maxSubarrayLength, currentLength);  // Update max length

            // Move the right boundary of the subarray
            // (outer loop will also do this, but for clarity, it's here as well)
            // This essentially slides the window to the right
            // and processes the next subarray segment.
        }

        // Subtract 1 to account for the element that we're deleting
        return maxSubarrayLength - 1;
    }
}
