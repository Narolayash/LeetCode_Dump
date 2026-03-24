package Practice;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] nums = {
                {24, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
        };

        System.out.println(Arrays.toString(search(nums, 12)));
        System.out.println(max(nums));
    }

    static int[] search(int[][] arr, int targer) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == targer) return new int[] {i, j};
            }
        }

        return new int[] {-1, -1};
    }

    static int max(int[][] arr) {
        int maxx = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > maxx) maxx = anInt;
            }
        }

        return maxx;
    }
}
