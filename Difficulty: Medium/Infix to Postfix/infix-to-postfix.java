import java.util.*;

class Solution {
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";

        for (char ch : s.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                res += ch;
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (st.peek() != '(') res += st.pop();
                st.pop();
            }
            else {
                while (!st.isEmpty() && prec(st.peek()) >= prec(ch)) {
                    if (ch == '^' && st.peek() == '^') break;
                    res += st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) res += st.pop();
        return res;
    }

    static int prec(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return -1;
    }
}