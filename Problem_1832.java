public class Problem_1832 {
    public boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) return false;
        }

        return true;
    }

    // public boolean checkIfPangram(String sentence) {
    //     int[] alpha = new int[26];

    //     for (char ch: sentence.toCharArray()) {
    //         alpha[ch - 'a']++;
    //     }

    //     for (int num : alpha) {
    //         if (num == 0) return false;
    //     }

    //     return true;
    // }
}
