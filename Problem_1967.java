public class Problem_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int subCount = 0;

        for (String s : patterns) {
            if (word.indexOf(s) != -1) subCount++;
        }

        return subCount;
    }
}
