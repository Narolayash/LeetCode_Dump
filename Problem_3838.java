public class Problem_3838 {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] ansString = new char[words.length];

        int i = 0;
        for (String word : words) {
            int sumOfWeight = 0;
            for (char ch : word.toCharArray()) {
                sumOfWeight += weights[ch - 'a'];
            }
            sumOfWeight %= 26;
            ansString[i++] = (char)('z' - sumOfWeight);
        }

        return new String(ansString);
    }
}
