package arrayandstrings.exercise5;

import java.util.regex.*;

class Solution {
    public String reverseVowels(String s) {

        int start = 0;
        int end = s.length() - 1;
        char[] sChar = s.toCharArray();

        while (start < end) {
            while (start < end && !isVowel(sChar[start])) {
                start++;
            }

            while (start < end && !isVowel(sChar[end])) {
                end--;
            }

            if (start < end) {
                char temp = sChar[start];
                sChar[start] = sChar[end];
                sChar[end] = temp;
                start++;
                end--;
            }
        }

        return new String(sChar);
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}