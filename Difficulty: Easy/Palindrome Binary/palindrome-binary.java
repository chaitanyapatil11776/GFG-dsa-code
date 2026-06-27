class Solution {
    public boolean isBinaryPalindrome(int n) {
        // code here
        String nn=Integer.toBinaryString(n);
        int left=0;
        int right=nn.length()-1;
        while(left<right){
            
            if(nn.charAt(left)!=nn.charAt(right)){
                return false;
            }left++;
            right--;
        }
        
        return true;
    }
}