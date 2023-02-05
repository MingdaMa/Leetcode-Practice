/*
* https://leetcode.com/problems/contains-duplicate/
* input: [1, 2, 3, 1]
* output: true
* explanation: input array contains duplicate numbers 1
* */

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int counter = 1;
        int element = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (counter == 0) {
                element = nums[i];
                counter++;
            } else if (element == nums[i]) {
                counter++;
            } else {
                counter--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 5};
        int[] nums1 = { 2 };
        int[] nums2 = {1, 3, 4, 4};
        int res = majorityElement(nums);
        int res1 = majorityElement(nums1);
        int res2 = majorityElement(nums2);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}
