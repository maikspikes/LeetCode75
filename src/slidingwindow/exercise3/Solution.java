package slidingwindow.exercise3;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxConsecutiveOnes = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            int maxLength = right - left + 1;
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, maxLength);
        }

        return maxConsecutiveOnes;
    }
}
