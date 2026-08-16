class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int idx = -1;
        int minDis = Integer.MAX_VALUE;

        int i = 0;
        for (int[] drone: drones) {
            int manhattan = Math.abs(drone[0] - target[0]) + Math.abs(drone[1] - target[1]);

            if (manhattan <= drone[2] && manhattan < minDis) {
                idx = i;
                minDis = manhattan;
            }

            i++;
        }

        return idx;
    }
}