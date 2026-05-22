package Practice;// Question :
// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/#finding-bound-and-then-binary-search-ologk-time-and-o1-space

// solution :
// https://chatgpt.com/share/6999ad70-c9a4-8013-a53c-3b19e35c3b0a


import java.util.List;
//
//public class InfiniteArray {
//    public static void main(String[] args) {
//        List<Integer> arr = List.of(3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170);
//        int k = 170;
//        System.out.println(infiniteArrayBS(arr, k));
//    }
//
//    static int infiniteArrayBS (List<Integer> arr, int target) {
//        int start = 0, end = 1;
//        while (end < arr.size() && target > arr.get(end)) {
//            int temp = end + 1;
//            end = end + (end - start + 1);
//            if (end > arr.size()) end = arr.size() - 1;
//            start = temp;
//        }
//
//        return binarySerach(arr, target, start, end);
//    }
//
//    static int binarySerach(List<Integer> arr, int targer, int start, int end) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (targer < arr.get(mid)) end = mid - 1;
//            else if(targer > arr.get(mid)) start = mid + 1;
//            else return mid;
//        }
//
//        return -1;
//    }
//}


