public class Problem_58 {
    public static void main(String[] args) {

    }

    static public int lengthOfLastWord(String s) {
        String trim = s.trim();

        int lastIndexOfSpace = trim.lastIndexOf(" ");
        return trim.length() - lastIndexOfSpace - 1;
    }

//    static public int lengthOfLastWord(String s) {
//        String []strings = s.trim().split(" ");
//
//        return (strings[strings.length - 1]).length();
//    }
}
