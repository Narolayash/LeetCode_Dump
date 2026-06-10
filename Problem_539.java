import java.util.List;

public class Problem_539 {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) return 0;

        boolean[] seen = new boolean[1440];

        for (String str : timePoints) {
            int h = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
            int m = (str.charAt(3) - '0') * 10 + (str.charAt(4) - '0');

            int minutes = h * 60 + m;

            if (seen[minutes]) return 0;
            seen[minutes] = true;
        }

        int minDiff = Integer.MAX_VALUE;
        int pre = -1;
        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;

        for (int i=0; i<1440; i++) {
            if (seen[i]) {
                if (pre != -1) {
                    minDiff = Math.min(minDiff, i - pre);
                }

                first = Math.min(first, i);
                last = Math.max(last, i);
                pre = i;
            }
        }

        return Math.min(minDiff, 1440 - last + first);
    }

}



// class Solution {
//     public int findMinDifference(List<String> timePoints) {
//         int n = timePoints.size();

//         int[] mins = new int[n];

//         int i = 0;
//         for (String str : timePoints) {
//             String[] temp = str.split(":");
//             int h = Integer.parseInt(temp[0]);
//             int m = Integer.parseInt(temp[1]);
//             if (h == 0 && m == 0) mins[i++] = 1440;
//             else mins[i++] = h * 60 + m;
//         }

//         Arrays.sort(mins);

//         int minDiff = Integer.MAX_VALUE;
//         for (int j=1; j<n; j++) {
//             minDiff = Math.min(minDiff, mins[j] - mins[j-1]);
//         }

//         return Math.min(minDiff, 1440 - mins[n-1] + mins[0]);

//         // int n = timePoints.size();
//         // int minDiff = Integer.MAX_VALUE;

//         // for (int i=0; i<n-1; i++) {
//         //     String time1[] = timePoints.get(i).split(":");

//         //     int hh1 = Integer.parseInt(time1[0]);
//         //     int mm1 = Integer.parseInt(time1[1]);

//         //     for (int j=i+1; j<n; j++) {
//         //         String time2[] = timePoints.get(j).split(":");

//         //         int hh2 = Integer.parseInt(time2[0]);
//         //         int mm2 = Integer.parseInt(time2[1]);

//         //         int total1 = hh1 * 60 + mm1;
//         //         int total2 = hh2 * 60 + mm2;

//         //         int diff = total1 < total2 ? total2 - total1 : total1 - total2;
//         //         minDiff = Math.min(minDiff, diff);
//         //     }
//         // }

//         // return minDiff;
//     }