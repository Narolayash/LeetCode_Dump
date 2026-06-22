public class Problem_2287 {
    public int rearrangeCharacters(String s, String target) {
        int[] counts = new int[26];
        int[] targetCount = new int[26];

        for (char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }

        for (char ch : target.toCharArray()) {
            targetCount[ch - 'a']++;
        }

        int tarCount = Integer.MAX_VALUE;
        char ch = 'a';
        for (int num : targetCount) {
            if (num != 0) {
                tarCount = Math.min(tarCount, counts[ch - 'a'] / num);
            }
            ch++;
        }

        return tarCount;
    }

}
