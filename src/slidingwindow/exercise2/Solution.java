package slidingwindow.exercise2;

import java.util.Arrays;

class Solution {
    public int maxVowels(String s, int k) {

        int maxVowelCount = 0;
        int currentVowelCount = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < k; i++) {
            char currentChar = s.charAt(i);
            if (Arrays.binarySearch(vowels, currentChar) >= 0) {
                currentVowelCount++;
            }
        }

        // Initialize maxVowelCount with the count from the first substring
        maxVowelCount = currentVowelCount;

        for (int i = k; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char removedChar = s.charAt(i - k);// Get the character that is being removed from the beginning of the substring

            if (Arrays.binarySearch(vowels, removedChar) >= 0) {
                currentVowelCount--;
            }

            // If the current character is a vowel, increment the current vowel count
            if (Arrays.binarySearch(vowels, currentChar) >= 0) {
                currentVowelCount++;
            }

            // Update maxVowelCount if the current vowel count is greater
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        return maxVowelCount;

    }
}