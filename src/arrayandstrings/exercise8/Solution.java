package arrayandstrings.exercise8;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        // brute force approach did not work as it exceeded the time limit of Leetcode
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k])
                        return true;
                }
            }
        }

        return false;
    }
}