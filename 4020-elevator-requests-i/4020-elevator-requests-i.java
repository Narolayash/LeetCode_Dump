class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sec = requests[0];

        for (int i=1; i<requests.length; i++) {
            sec += Math.abs(requests[i] - requests[i - 1]);
        }

        return sec;
    }
}