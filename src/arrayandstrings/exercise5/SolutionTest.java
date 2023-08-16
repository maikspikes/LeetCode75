package arrayandstrings.exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseVowels() {
        Solution solution = new Solution();
        //test1
        String s1 = "aho";
        assertEquals("oha", solution.reverseVowels(s1));

        //test2
        String s2 = "AHO";
        assertEquals("OHA", solution.reverseVowels(s2));

        //test3
        String s3 = "AHUKHEJIHJHBDO";
        assertEquals("OHIKHEJUHJHBDA", solution.reverseVowels(s3));
    }
}