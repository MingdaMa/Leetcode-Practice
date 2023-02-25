/*
 * https://leetcode.com/problems/sort-the-students-by-their-kth-score/
 * input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
 * output: [true,false,true]
 * explanation: In the 0th query, the subarray is [4,6,5]. This can be rearranged as [6,5,4], which is an arithmetic sequence.
                In the 1st query, the subarray is [4,6,5,9]. This cannot be rearranged as an arithmetic sequence.
                In the 2nd query, the subarray is [5,9,3,7]. This can be rearranged as [3,5,7,9], which is an arithmetic sequence.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArithmeticSubarrays {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<Boolean>(l.length);
        for (int i = 0; i < l.length; i++) {
            int start = l[i];
            int end = r[i];
            int[] sublist = new int[end - start + 1];
            for (int j = 0; j < sublist.length; j++) {
                sublist[j] = nums[start + j];
            }
            Arrays.sort(sublist);

            if (sublist.length == 1 || sublist.length == 2) {
                res.add(true);
                continue;
            }

            boolean is_arithmatic = true;
            for (int j = 1; j < sublist.length - 1; j++) {
                if (sublist[j] - sublist[j - 1] != sublist[j + 1] - sublist[j]) {
                    is_arithmatic = false;
                }
            }

            if (is_arithmatic) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,6,5,9,3,7};
        int[] l = new int[]{0,0,2};
        int[] r = new int[]{2,3,5};
        List<Boolean> res = checkArithmeticSubarrays(nums, l, r);
        System.out.println(Arrays.toString(res.toArray()));
    }
}
