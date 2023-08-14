package arrayandstrings.exercise2;

class Solution {

    public String gcdOfStrings(String str1, String str2) {

        String string1 = str1.toUpperCase();
        String string2 = str2.toUpperCase();

        int length1 = string1.length();
        int length2 = string2.length();

        int gcd = gcd(length1, length2);

        String repeatedStr = str1.substring(0, gcd);
        if (str1.equals(repeatedStr.repeat(length1 / gcd)) && str2.equals(repeatedStr.repeat(length2 / gcd))) {
            return repeatedStr;
        }

        // If no common divisor, return empty string
        return "";
    }

    private int gcd(int a, int b) {
        if (b == 0) {
        return a;
    }
        return gcd(b, a % b);
    }

}