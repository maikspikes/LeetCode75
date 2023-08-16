package arrayandstrings.exercise6;

public class Solution {
    public String reverseWords(String s) {
        // Split the string into words using one or more spaces as the delimiter
        String[] words = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();

        // Traverse the words array in reverse order and append to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a single space between words
            }
        }

        return reversed.toString();
    }
}
