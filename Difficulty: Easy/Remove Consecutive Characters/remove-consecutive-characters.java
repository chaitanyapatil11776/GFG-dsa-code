// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
 int n=s.length();
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
            }
           
        }
        sb.append(s.charAt(n-1));
        return sb.toString();
        
    }
}