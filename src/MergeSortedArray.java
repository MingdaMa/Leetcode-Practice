/*
https://leetcode.com/problems/merge-sorted-array/
input: nums1 = [1, 2, 3, 0, 0, 0], m = 3, num2 = [2, 5, 6], n = 3
output: [1, 2, 2, 3, 5, 6]
*/

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n;
        int k = total - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while (k >= 0 && p1 >= 0 || p2 >= 0) {
            if (p1 < 0) {
                nums1[k] = nums2[p2];
                p2--;
            } else if (p2 < 0) {
                nums1[k] = nums1[p1];
                p1--;
            } else if (nums1[p1] < nums2[p2]) {
                nums1[k] = nums2[p2];
                p2--;
            } else {
                nums1[k] = nums1[p1];
                p1--;
            }
            k--;
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
