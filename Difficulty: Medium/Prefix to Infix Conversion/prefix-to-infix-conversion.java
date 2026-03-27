import java.util.*;

class Solution {
    static String preToInfix(String pre_exp) {
        Stack<String> st = new Stack<>();

        // traverse from RIGHT to LEFT
        for (int i = pre_exp.length() - 1; i >= 0; i--) {
            char ch = pre_exp.charAt(i);

            // if operand
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } 
            // if operator
            else {
                String op1 = st.pop();
                String op2 = st.pop();

                String exp = "(" + op1 + ch + op2 + ")";
                st.push(exp);
            }
        }

        return st.pop();
    }
}