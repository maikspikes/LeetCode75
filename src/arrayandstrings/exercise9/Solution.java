package arrayandstrings.exercise9;

class Solution {
    public int compress(char[] chars) {

        int groupLength = 1; // Initialize the group length to 1 (counting the first character)
        int index = 0; // Index to track the position in the compressed array

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                groupLength++; // Increment group length for consecutive characters
            } else {
                // Place the character in the compressed array
                chars[index++] = chars[i - 1];
                // Place the group length if greater than 1
                if (groupLength > 1) {
                    // Convert the group length to a string
                    String countStr = String.valueOf(groupLength);
                    // Place each digit of the group length in the compressed array
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }

                // Reset the group length for the next character
                groupLength = 1;
            }
        }

        return index; // Return the length of the compressed array
    }
}