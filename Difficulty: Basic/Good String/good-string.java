// User function Template for Java
class Solution {
    String isGoodString(String s) {
        // code here
        int n=s.length();
        if(n==1)return "YES";
        for(int i=0;i<n-1;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            int diff=Math.abs(a-b);
            int dist=Math.min(diff,26-diff);
            if(dist!=1){
                return "NO";
            }
        }return "YES";
    }
}