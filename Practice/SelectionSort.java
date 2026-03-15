package Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for(int i=0; i < arr.length - 1; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = 0;

            for (int j=1; j <= lastIndex; j++) {
                if (arr[maxIndex] < arr[j])
                    maxIndex = j;
            }

            int temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
