package Prefixsum.exercise1;

class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestPoint = currentAltitude;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];

            highestPoint = Math.max(highestPoint, currentAltitude);
        }

        return highestPoint;
    }
}