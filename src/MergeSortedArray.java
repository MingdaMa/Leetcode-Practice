/*
https://leetcode.com/problems/merge-sorted-array/
input: nums1 = [1, 2, 3, 0, 0, 0], m = 3, num2 = [2, 5, 6], n = 3
output: [1, 2, 2, 3, 5, 6]
*/

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1; // the end index of nums1
        int index2 = n - 1; // the end index of nums2
        int k = nums1.length - 1; // the length of nums1
        while (index2 >= 0) {
            // compare nums1 at index1 and nums2 at index2
            // if nums1[index1] is greater than nums2[index2]
            // nums1[k] should be nums1[index1], decrement both index1 and k
            // else nums1[k] should be nums2[index2], decrement both index2 and k
            if (nums1[index1] > nums2[index2]) {
                nums1[k] = nums1[index1];
                index1--;
                k--;
            } else {
                nums1[k] = nums2[index2];
                index2--;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {1, 5, 6};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
