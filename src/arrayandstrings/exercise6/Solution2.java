package arrayandstrings.exercise6;

import java.util.Arrays;

public class Solution2 {
    public String reverseWords(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                .reduce((a, b) -> b + " " + a)
                .orElse("");
    }
}