class Solution {
    boolean isPalindrome(String s) {
        // code here
        int right=s.length()-1;
        int left=0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}