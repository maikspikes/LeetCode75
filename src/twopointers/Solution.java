package twopointers;

class Solution {
    public void moveZeroes(int[] nums) {
        int NotZerosFound = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // the not-zero number will be the new i
                nums[NotZerosFound++] = nums[i];
            }
        }
        // This loop starts with the non-zero numbers found, and will append all the indexes of 0 to the array
        for (int i = NotZerosFound; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}