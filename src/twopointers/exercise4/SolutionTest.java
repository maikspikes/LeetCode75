package twopointers.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testExample1() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int expected = 2;
        int result = Solution.maxOperations(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        int expected = 1;
        int result = Solution.maxOperations(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void testAdditional1() {
        int[] nums = {2, 2, 2, 2};
        int k = 4;
        int expected = 2;
        int result = Solution.maxOperations(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void testAdditional2() {
        int[] nums = {1, 3, 5, 7, 9};
        int k = 10;
        int expected = 2;
        int result = Solution.maxOperations(nums, k);
        assertEquals(expected, result);
    }

}