public class Problem_3992 {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder();

        char[] str = s.toCharArray();

        for (char ch : str) {
            if (ch == y) sb.append(ch);
        }

        for (char ch : str) {
            if (ch != y) sb.append(ch);
        }

        return sb.toString();
    }
}
