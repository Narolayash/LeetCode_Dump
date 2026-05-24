public class Problem_278 {
    public int firstBadVersion(int n) {
        int start = 1, end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) end = mid;
            else start = mid + 1;
        }

        return start;
    }

//    public int firstBadVersion(int n) {
//        int start = 1, end = n;
//
//        int ans = -1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            boolean res = isBadVersion(mid);
//            if (res) {
//                ans = mid;
//                end = mid - 1;
//            }
//
//            if (!res) start = mid + 1;
//        }
//
//        return ans;
//    }
}
