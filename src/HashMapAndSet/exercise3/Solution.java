package HashMapAndSet.exercise3;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean closeStrings(String word1, String word2) {

        int[] counts1 = new int[26];
        int[] counts2 = new int[26];

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char c : word1.toCharArray()) {
            counts1[c - 'a'] ++;
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            counts2[c - 'a'] ++;
            set2.add(c);
        }

        Arrays.sort(counts1);
        Arrays.sort(counts2);
        return set1.equals(set2) && Arrays.equals(counts1, counts2);

    }
}