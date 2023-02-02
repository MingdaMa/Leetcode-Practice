/*
* https://leetcode.com/problems/contains-duplicate/description/
* input: [1, 2, 3, 1]
* output: true
* explanation: input array contains duplicate numbers 1
* */

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // sort the array
        // if adjacent numbers are the same, return true
        // if at the end of the loop, there are no two numbers are the same, return false
        Arrays.sort(nums);
        // edge case: if the length of the array is less than 2, there is no duplicates in the array
        if (nums.length <= 1) {
            return false;
        }
        for (int i = 0; i< nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {1};
        int[] nums2 = {1, 3, 4, 1};
        boolean res = containsDuplicate(nums);
        boolean res1 = containsDuplicate(nums1);
        boolean res2 = containsDuplicate(nums2);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}
