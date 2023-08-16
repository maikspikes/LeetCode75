package arrayandstrings.exercise8;

public class Solution2 {
    //this is an example of the greedy algorithm
    public boolean increasingTriplet(int[] nums) {

        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstmin){
                firstmin = num;
            } else if (num <= secondmin) {
                secondmin = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
