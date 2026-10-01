class Solution {
    public boolean isValid(String s) {
        char[] chStack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') 
                chStack[++top] = ch;
            else {
                if (top < 0) return false;
                char t = chStack[top--];
                if (ch == ')' && t != '(' ||
                    ch == ']' && t != '[' ||
                    ch == '}' && t != '{' ) return false;
            }   
        }

        return top == -1;
    }
}