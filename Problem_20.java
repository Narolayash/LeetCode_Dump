import java.util.Stack;

public class Problem_20 {
    public static void main(String[] args) {

    }

    // this is mine
    public static boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                parentheses.push(ch);
            else {
                if (parentheses.isEmpty())
                    return false;
                char lastCh = parentheses.pop();
                if (ch == ')' && lastCh != '(' || ch == '}' && lastCh != '{' || ch ==']' && lastCh != '[')
                    return false;
            }
        }

        return parentheses.isEmpty();
    }
}

// extra for learning
// good logic
//class Solution {
//    public boolean isValid(String s) {
//        if(s.length() % 2 == 1)
//            return false;
//        return isValid(0, ' ', s.toCharArray()) >= 0;
//    }
//
//    private int isValid(int i,char last, char[] s){
//        if(i == s.length){
//            return i;
//        }
//        if(i > s.length){
//            return -1;
//        }
//
//        if(s[i] == '(' || s[i] == '{' || s[i] == '['){
//            int next = isValid(i + 1, s[i], s);
//            return next < 0 ? -1 : isValid(next + 1, last, s);
//        }
//
//        if(s[i] == ')' && last == '(' || s[i] == ']' && last == '[' ||s[i] == '}' && last == '{'){
//            return i;
//        }
//        return -1;
//    }
//
//}

