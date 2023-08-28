package twopointers.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testIsSubsequencePositive() {
        assertTrue(Solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void testIsSubsequenceNegative() {
        assertFalse(Solution.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void testIsSubsequenceEmptyS() {
        assertTrue(Solution.isSubsequence("", "ahbgdc"));
    }
}