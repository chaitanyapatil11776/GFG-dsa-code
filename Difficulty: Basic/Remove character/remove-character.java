// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code hereS
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            boolean ss=true;
            for(int j=0;j<str2.length();j++){
                if(c==str2.charAt(j)){
                    ss=false;
                    break;
                }
            }
            if(ss){
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}