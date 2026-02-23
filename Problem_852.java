public class Problem_852 {
    public static void main(String[] args) {
    //        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));
        System.out.println(peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) end = mid;
            else if(arr[mid] < arr[mid + 1]) start = mid + 1;
            if (start == end) return start;
        }

        return -1;
    }

//    public static int peakIndexInMountainArray(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        int max_index = -1;
//
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] > max) {
//                max = arr[index];
//                max_index = index;
//            }
//        }
//
//        return max_index;
//    }
}
