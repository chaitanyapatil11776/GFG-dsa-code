// User function Template for Java

class Solution {
    static long isPallindrome(long N) {
        // code herent
        String bin=Long.toBinaryString(N);
        int l=0;
        int r=bin.length()-1;
        while(l<r){
            if(bin.charAt(l)!=bin.charAt(r)){
                return 0;
            }
            l++;
            r--;
        }
        return 1;
        
    }
}