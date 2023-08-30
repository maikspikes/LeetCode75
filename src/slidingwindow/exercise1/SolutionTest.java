package slidingwindow.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void findMaxAverage() {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        double expected1 = 12.75;
        double result1 = solution.findMaxAverage(nums1, k1);
        assertEquals(expected1, result1, 0.00001);

        // Test case 2
        int[] nums2 = {5};
        int k2 = 1;
        double expected2 = 5.0;
        double result2 = solution.findMaxAverage(nums2, k2);
        assertEquals(expected2, result2, 0.00001);

        // Test case 3
        int[] nums3 = {3, 3, 3, 3, 3};
        int k3 = 2;
        double expected3 = 3.0;
        double result3 = solution.findMaxAverage(nums3, k3);
        assertEquals(expected3, result3, 0.00001);

        int[] nums4 = {1, 12, -5, -6, 50, 3};
        int k4 = 4;
        double expected4 = 12.75000;
        double result4 = solution.findMaxAverage(nums1, k1);
        double delta = 0.00001;
        assertEquals(expected4, result4, delta);
    }

}
