// User function Template for Java
class Solution {
    int minManipulation(int N, String S1, String S2) {
        // code here
        HashMap<Character,Integer>ss=new HashMap<>();
        for( char c:S1.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        for(char c:S2.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)-1);
        }
        int del=0;
        for(int val:ss.values()){
            if(val>0){
                del+=val;
            }
        }
        return del;
        
        
    }
}