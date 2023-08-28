package twopointers.exercise3;

class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[right], height[left]);
            int currentArea = minHeight * (right - left);
            maxArea = Math.max(maxArea, currentArea);


            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}