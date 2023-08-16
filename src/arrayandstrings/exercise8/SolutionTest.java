package arrayandstrings.exercise8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void increasingTriplet() {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.increasingTriplet(nums), "Expected true");

        int[] nums2 = {1, 2, 8, 1};
        assertTrue(solution.increasingTriplet(nums2), "Expected true");
    }
}