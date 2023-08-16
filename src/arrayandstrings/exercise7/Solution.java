package arrayandstrings.exercise7;

class Solution {
    // brute force approach did not work in the solution of LeetCode because it exceeded time limit
    public int[] productExceptSelf(int[] nums) {

        int answer[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int pro = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                pro *= nums[j];
            }
            answer[i] = pro;
        }
        return answer;
    }
}