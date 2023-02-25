/*
 * https://leetcode.com/problems/sort-the-matrix-diagonally/
 * input: mat = [[3,3,1,1],
 *              [2,2,1,2],
 *              [1,1,1,2]]
 * output: [[1,1,1,1],
 *          [1,2,2,2],
 *          [1,2,3,3]]
 * explanation: we have to sort the matrix diagonally
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheMatrixDiagonally {
    public static int[][] diagonalSort(int[][] mat) {
        int rowCount = mat.length;
        int colCount = mat[0].length;

        for (int i = 0; i < rowCount - 1; i++) {
            sort(mat, i, 0, rowCount, colCount);
        }

        for (int j = 1; j < colCount; j++) {
            sort(mat, 0, j, rowCount, colCount);
        }

        return mat;
    }

    public static void sort(int[][] mat, int row, int col, int rowCount, int colCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int r = row;
        int c = col;
        while (r < rowCount && c < colCount) {
            list.add(mat[r][c]);
            r++;
            c++;
        }

        Collections.sort(list);
        r = row;
        c = col;
        int temp = 0;
        while (r < rowCount && c < colCount) {
            mat[r][c] = list.get(temp);
            temp++;
            r++;
            c++;
        }
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        diagonalSort(mat);
        for (int row = 0; row < mat.length; row++) {
            System.out.println(Arrays.toString(mat[row]));
        }
    }

}
