package arrayandstrings.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    @Test
    public void testGCDOfStrings() {
        Solution solution = new Solution();

        // Test case 1
        String str1 = "ABCABC";
        String str2 = "ABC";
        assertEquals("ABC", solution.gcdOfStrings(str1, str2));

        // Test case 2
        str1 = "ABABAB";
        str2 = "ABAB";
        assertEquals("AB", solution.gcdOfStrings(str1, str2));

        // Test case 3
        str1 = "LEET";
        str2 = "CODE";
        assertEquals("", solution.gcdOfStrings(str1, str2));
    }


}
