public class Problem_1732 {
        public int largestAltitude(int[] gain) {
            int maxAltitude = 0;
            int currentAltitude = 0;

            for (int num: gain) {
                currentAltitude += num;
                maxAltitude = Math.max(currentAltitude, maxAltitude);
            }

            return maxAltitude;
        }

        // public int largestAltitude(int[] gain) {
        //     int ans = Math.max(gain[0], 0);
        //     int sum = gain[0];

        //     for (int i=1; i<gain.length; i++) {
        //         ans = Math.max(ans, gain[i] + sum);
        //         sum += gain[i];
        //     }

        //     return ans;
        // }
}
