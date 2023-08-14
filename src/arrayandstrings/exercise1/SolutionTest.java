package arrayandstrings.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testMergeAlternately() {
        Solution solution = new Solution();

        // Test case 1
        String word1 = "abc";
        String word2 = "def";
        assertEquals("adbecf", solution.mergeAlternately(word1, word2));

        // Test case 2
        word1 = "abcd";
        word2 = "ef";
        assertEquals("aebfcd", solution.mergeAlternately(word1, word2));

        // Test case 3
        word1 = "xyz";
        word2 = "abc";
        assertEquals("xaybzc", solution.mergeAlternately(word1, word2));

        // Additional test case
        word1 = "abc";
        word2 = "";
        assertEquals("abc", solution.mergeAlternately(word1, word2));

        word1 = "";
        word2 = "def";
        assertEquals("def", solution.mergeAlternately(word1, word2));
    }

    // You can add more test cases here
}