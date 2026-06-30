public class Problem_1358 {
    // for (int i=0; i<s.length()-2; i++) {
    //     for (int j=i+3; j<=s.length(); j++) {
    //         String temp = s.substring(i, j);
    //         if (temp.indexOf("a") != -1 && temp.indexOf("b") != -1 && temp.indexOf("c") != -1)
    //             subStringCount++;
    //     }
    // }



    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3];
        int ans = 0;

        int left=0, right=0;
        for (right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] != 0 && count[1] != 0 && count[2] != 0) {
                ans += n - right;
                count[s.charAt(left++) - 'a']--;
            }
        }

        return ans;
    }
}
