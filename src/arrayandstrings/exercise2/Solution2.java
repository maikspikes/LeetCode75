package arrayandstrings.exercise2;

public class Solution2 {
    public String gcdOfStrings(String str1, String str2) {

        // Find the greatest common divisor (GCD) of the lengths of str1 and str2
        int len1 = str1.length();
        int len2 = str2.length();
        int gcd = gcd(len1, len2);

        // Check if str2 is a repeated substring of str1, and vice versa
        String repeatedStr = str1.substring(0, gcd);
        if (str1.equals(repeatedStr.repeat(len1 / gcd))
                && str2.equals(repeatedStr.repeat(len2 / gcd))) {
            return repeatedStr;
        }

        // If no common divisor, return empty string
        return "";
    }

    // Helper function to compute the greatest common divisor (gcd) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}

