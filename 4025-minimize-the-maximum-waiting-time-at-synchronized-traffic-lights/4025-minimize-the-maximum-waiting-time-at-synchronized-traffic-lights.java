class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int penalty = 0;

        for (int time: arrivalTime) {
            int r = time % period;

            boolean pass = false;
            for (int light: lights) {
                if (r < light) {
                    pass = true;
                    break;
                }  
            }

            if (!pass) penalty = Math.max(penalty, period - r);
        }

        return penalty;
    }
}