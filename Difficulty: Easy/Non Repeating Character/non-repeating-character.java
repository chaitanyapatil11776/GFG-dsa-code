class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
            
        }
        
        for(char c:s.toCharArray()){
            if(ss.get(c)==1)return c;
        }
        
        return '$';
    }
}
