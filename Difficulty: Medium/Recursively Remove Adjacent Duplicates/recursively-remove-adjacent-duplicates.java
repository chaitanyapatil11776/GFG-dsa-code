// User function Template for Java

class Solution {
    public String removeUtil(String s) {
        // code hereg
        // Stack<Character>ss=new Stack<>();
        StringBuilder sb=new StringBuilder();
        boolean remove=false;
        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            if(j-i==1){
                sb.append(s.charAt(i));
            }else{
                remove=true;
            }
            i=j;
        }
       
        if(!remove)return sb.toString();
        // s=sb.toString();\
        return removeUtil(sb.toString());
    }
}