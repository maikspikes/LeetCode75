package HashMapAndSet.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println(result);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> notInNums2 = new ArrayList<>();
        List<Integer> notInNums1 = new ArrayList<>();

        for (int num : nums1) {
            if (!set2.contains(num) && !notInNums2.contains(num)) {
                notInNums2.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num) && !notInNums1.contains(num)) {
                notInNums1.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(notInNums2);
        result.add(notInNums1);

        return result;
    }
}

