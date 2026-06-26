
public class Problem_2390 {
    public String removeStars(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int top = 0;

        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '*' && top > 0) top--;
            else {
                stack[top++] = s.charAt(i);
            }
        }

        return new String(stack, 0, top);
    }
}


//char* removeStars(char* s) {
//    int i = 0, j = 0;
//
//    while (s[j] != '\0') {
//        if (s[j] == '*' && i > 0) i--;
//        else {
//            s[i++] = s[j];
//        }
//        j++;
//    }
//    s[i] = '\0';
//
//    return s;
//}
