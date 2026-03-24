package Practice;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 95, 75, 15};
        int tar = 50;
        System.out.println(linearSearch(arr, 50, 3, 5));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return -1;

        for(int i=start; i<=end; i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }
}
