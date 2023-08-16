package arrayandstrings.exercise7;

class Solution4 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] output_arr = new int[n];

        output_arr[0] = 1;

        for (int i = 1; i < n; i++) {
            output_arr[i] = nums[i - 1] * output_arr[i - 1];
        }

        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            output_arr[i] = output_arr[i] * r;
            r = r * nums[i];
        }

        return output_arr;
    }
}