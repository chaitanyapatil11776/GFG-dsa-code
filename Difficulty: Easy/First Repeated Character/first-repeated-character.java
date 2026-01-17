// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character >ss=new HashSet<>();
        for(char c:s.toCharArray() ){
            if(ss.contains(c)){
                return String.valueOf(c);
            }
            ss.add(c);
        }
        return "-1";
        
    }
}