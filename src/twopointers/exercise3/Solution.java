package twopointers.exercise3;

class Solution {
    /*
    Approach: Two pointers each starting from the beginning and the end until they both meet.

    In the code, you have two pointers named left and right initialized to the beginning and end of the array, respectively.
    These pointers move towards each other as the loop iterates.
    The loop continues as long as the left pointer is less than the right pointer.
    This pattern is used to explore different pairs of elements from both ends of the array.
     */
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