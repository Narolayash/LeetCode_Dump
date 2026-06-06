public class Problem_1854 {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        for (int i=1; i<101; i++) {
            years[i] += years[i-1];
        }

        int maxyear = 1950, maxpopulation = years[0];
        for (int i=maxyear-1949; i<101; i++) {
            if (years[i] > maxpopulation) {
                maxpopulation = years[i];
                maxyear = i + 1950;
            }
        }

        return maxyear;
    }
}
