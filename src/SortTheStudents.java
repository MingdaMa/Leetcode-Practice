/*
* https://leetcode.com/problems/sort-the-students-by-their-kth-score/
* input: score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
* output: [[7,5,11,2],[10,6,9,1],[4,8,3,15]]
* explanation: We have to sort students' scores based on score at position k in ascending order,
*/

import java.util.Arrays;

public class SortTheStudents {

    public static void switchRow(int[][] score, int rowIndex1, int rowIndex2) {
        for (int i = 0; i < score[0].length; i++) {
            int temp = score[rowIndex1][i];
            score[rowIndex1][i] = score[rowIndex2][i];
            score[rowIndex2][i] = temp;
        }
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length; i++) {
            int largest = i;
            for (int j = i + 1; j < score.length; j++) {
                if (score[j][k] > score[largest][k]) {
                    largest = j;
                }
            }
            switchRow(score, largest, i);
        }
        return score;
    }

    public static void main(String[] args) {
        int[][] score = new int[][]{{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;
        sortTheStudents(score, k);
    }
}
