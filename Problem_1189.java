public class Problem_1189 {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (char ch : text.toCharArray()) {
            if (ch == 'b') b++;
            else if (ch == 'a') a++;
            else if (ch == 'l') l++;
            else if (ch == 'o') o++;
            else if (ch == 'n') n++;
        }

        l /= 2;
        o /= 2;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }



//    public int maxNumberOfBalloons(String text) {
//        int[] counts = new int[5];
//
//        for (char ch : text.toCharArray()) {
//            if (ch == 'b') counts[0]++;
//            else if (ch == 'a') counts[1]++;
//            else if (ch == 'l') counts[2]++;
//            else if (ch == 'o') counts[3]++;
//            else if (ch == 'n') counts[4]++;
//        }
//
//        int balloonCount = counts[0];
//        if (counts[1] < balloonCount) balloonCount = counts[1];
//        if (counts[2] < balloonCount * 2) balloonCount = counts[2] / 2;
//        if (counts[3] < balloonCount * 2) balloonCount = counts[3] / 2;
//        if (counts[4] < balloonCount) balloonCount = counts[4];
//
//
//        return balloonCount;
//    }
}
