package arrayandstrings.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
        Solution solution = new Solution();

    @Test
    void canPlaceFlowers() {
        //test1
        int[] flowerbed1 = {1, 0, 0, 1};
        int n1 = 0;
        assertTrue(solution.canPlaceFlowers(flowerbed1, n1), "Expected true");

        //test 2
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed2, n2), "Expected true");

        //test 3
        int[] flowerbed3 = {0, 0, 0, 0, 0};
        int n3 = 3;
        assertTrue(solution.canPlaceFlowers(flowerbed3, n3), "Expected true");
    }

}