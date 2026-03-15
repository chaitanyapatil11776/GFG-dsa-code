class Solution {
    public static int maxDepth(String s) {
        // code here
        int max=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                depth++;
                max=Math.max(max,depth);
            }else if(c==')'){
                depth--;
            }
        }
        return max;
    }
}
