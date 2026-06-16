public class Problem_3612 {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            }
            else if (ch == '#') sb.append(sb);
            else if (ch == '%') sb.reverse();
            else sb.append(ch);
        }

        return sb.toString();
    }



//    public String processStr(String s) {
//        StringBuilder sb = new StringBuilder();
//
//        for (char ch : s.toCharArray()) {
//            if (sb.length() > 0 && !Character.isLetter(ch)) {
//                if (ch == '*') sb.deleteCharAt(sb.length() - 1);
//                else if (ch == '#') sb.append(sb);
//                else if (ch == '%') sb.reverse();
//            }
//            else if (Character.isLetter(ch)) sb.append(ch);
//        }
//
//        return sb.toString();
//    }
}
