public class Problem_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;

        for (int i=0; i<stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) c++;
        }

        return c;
    }



//    public int numJewelsInStones(String jewels, String stones) {
//        int jewelsCount = 0;
//
//        for (char ch : stones.toCharArray()) {
//            if (jewels.indexOf(ch) != -1) jewelsCount++;
//        }
//
//        return jewelsCount;
//    }




    // public int numJewelsInStones(String jewels, String stones) {
    //     int[] upletter = new int[32];
    //     int[] lowletter = new int[32];

    //     for (char ch : stones.toCharArray()) {
    //         if (Character.isUpperCase(ch)) upletter[ch - 'A']++;
    //         else lowletter[ch - 'a']++;
    //     }

    //     int jewelsCount = 0;
    //     for (char ch : jewels.toCharArray()) {
    //         if (Character.isUpperCase(ch)) jewelsCount += upletter[ch - 'A'];
    //         else jewelsCount += lowletter[ch - 'a'];
    //     }

    //     return jewelsCount;
    // }
}
