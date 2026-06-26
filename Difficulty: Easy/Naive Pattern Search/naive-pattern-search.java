

class Solution {
    // Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt) {
        // Your code here
        int m=txt.length();
        int n=pat.length();
        for(int i=0;i<=m-n;i++){
            int j;
            for(j=0;j<n;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==n){
                return true;
            }
        }
        return false;
    }
}