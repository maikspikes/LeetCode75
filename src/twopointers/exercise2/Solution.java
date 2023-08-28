package twopointers.exercise2;

class Solution {

    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;

        // Loop through string t using tPointer
        for (int tPointer = 0; tPointer < t.length() && sPointer < s.length(); tPointer++) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                // If the characters match, move sPointer forward
                // Only increment the sPointer if the same character is present in the T pointer (which can be more advanced!!)
                sPointer++;
            }
        }

        // Check if all characters in s have been matched
        // if the s string is not the same length as the sPointer, it will be false
        return sPointer == s.length();
    }
}