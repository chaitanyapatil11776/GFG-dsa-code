import java.util.*;

class Solution {
    public static String postToInfix(String s) {
        Stack<String> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } 
            else {
                String b = st.pop();
                String a = st.pop();

                String exp = "(" + a + ch + b + ")";
                st.push(exp);
            }
        }

        return st.pop();
    }
}