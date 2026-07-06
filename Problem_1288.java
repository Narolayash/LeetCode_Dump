import java.util.Arrays;

public class Problem_1288 {
    // best for small input set
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int remaining = n;

        for (int i = 0; i < n; i++) {
            boolean covered = false;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {
                    covered = true;
                    break;
                }
            }

            if (covered) remaining--;
        }

        return remaining;
    }



//    public int removeCoveredIntervals(int[][] intervals) {
//        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
//
//        int count = 0;
//        int max = 0;
//        for (int[] interval : intervals) {
//            if (interval[1] > max) {
//                count++;
//                max = interval[1];
//            }
//        }
//
//        return count;
//    }
}
