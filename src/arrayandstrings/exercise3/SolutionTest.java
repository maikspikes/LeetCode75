package arrayandstrings.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void kidsWithCandies() {
        Solution solution = new Solution();

        //test1
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result1 = solution.kidsWithCandies(candies, extraCandies);
        assertArrayEquals(new Boolean[]{true, true, true, false, true}, result1.toArray());

    }
}