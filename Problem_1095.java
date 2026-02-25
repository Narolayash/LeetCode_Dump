///**
// * // This is MountainArray's API interface.
// * // You should not implement it, or speculate about its implementation
// * interface MountainArray {
// *     public int get(int index) {}
// *     public int length() {}
// * }
// */
//
//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peakIndex = peakOfMountain(mountainArr);
//
//        if (mountainArr.get(peakIndex) == target) return peakIndex;
//
//        int tryy = binaraySearch(target, mountainArr, 0, peakIndex - 1, true);
//        if (tryy != -1)
//            return tryy;
//
//        return binaraySearch(target, mountainArr, peakIndex + 1, mountainArr.length() - 1, false);
//    }
//
//    public int peakOfMountain(MountainArray mountainArray) {
//        int start = 0, end = mountainArray.length() - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//
//            if (mountainArray.get(mid) < mountainArray.get(mid + 1))
//                start = mid + 1;
//            else
//                end = mid;
//        }
//
//        return start;
//    }
//
//    public int binaraySearch(int target, MountainArray mountainArr, int start, int end, boolean isAsending) {
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (mountainArr.get(mid) == target) return mid;
//
//            if ((isAsending && (mountainArr.get(mid) > target)) || (!isAsending && (mountainArr.get(mid) < target)))
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//
//        return -1;
//    }
//}
