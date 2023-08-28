package arrayandstrings.exercise1;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 <= 1 || len2 <= 100) {

        }
        StringBuilder stringBuilder = new StringBuilder();


        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (len1 > len2) {
            stringBuilder.append(word1.substring(minLength));
        } else if (len2 > len1) {
            stringBuilder.append(word2.substring(minLength));
        }

        return stringBuilder.toString();
    }
}