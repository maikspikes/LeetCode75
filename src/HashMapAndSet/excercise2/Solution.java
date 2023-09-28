package HashMapAndSet.excercise2;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    /*
    The hasmap wil store the values like
    in an arr containing {1, 2, 2, 3, 3, 2, 3, 1, 3}
    It will keep track of the ammount of times a value has been present {1 : 2 , 2 : 3 , 3 : 4}
    At last, the set does the final check
     */
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num , map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}
