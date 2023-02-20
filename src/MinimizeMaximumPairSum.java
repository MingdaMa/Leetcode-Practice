/*
* https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
* input: nums = [3, 5, 2, 3]
* output: 7
* explanation: The goal is to pair the numbers in the array into two-element pairs in the way that minimizing
*              the maximum pair sum. The way to achieve this is to
*              1. sort the array
*              2. make numbers at the head and at the tail pair with each other
*              3. find the maximum of the pair sums, it should be the minimum pair sum
* */


import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimizeMaximumPairSum {
    public static int minPairSum(int[] nums) {
        int res = nums[0];
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (res < sum) {
                res = sum;
            }
            left++;
            right--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,5,2,3};
        int res = minPairSum(nums);
        System.out.println(res);
    }
}
