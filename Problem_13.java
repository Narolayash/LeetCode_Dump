public class Problem_13 {
    public int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }

    public int romanToInt(String s) {
        int num = 0;
        int preValue = 0;

        for (int i=s.length() - 1; i>=0; i--) {
            int currValue = getValue(s.charAt(i));
            if (preValue > currValue) num -= currValue;
            else num += currValue;

            preValue = currValue;
        }

        return num;
    }


    


    //    public int romanToInt(String s) {
//        int num = 0;
//        char last = ' ';
//
//        for (char ch : s.toCharArray()) {
//            if (ch == 'M') {
//                if (last == 'C') num += 800;
//                else num += 1000;
//            }
//            else if (ch == 'D') {
//                if (last == 'C') num += 300;
//                else num += 500;
//            }
//            else if (ch == 'C') {
//                if (last == 'X') num += 80;
//                else num += 100;
//            }
//            else if (ch == 'L') {
//                if (last == 'X') num += 30;
//                else num += 50;
//            }
//            else if (ch == 'X') {
//                if (last == 'I') num += 8;
//                else num += 10;
//            }
//            else if (ch == 'V') {
//                if (last == 'I') num += 3;
//                else num += 5;
//            }
//            else if (ch == 'I') num += 1;
//            last = ch;
//        }
//
//        return num;
//    }
}
