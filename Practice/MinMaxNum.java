public class MinMaxNum {
    public static void main(String[] args) {
        int[] arr = {57, 24, 48, 63, 27, 55};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int mini = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < mini) mini = j;
        }

        return mini;
    }

    static int max(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > maxi) maxi = j;
        }

        return maxi;
    }
}
