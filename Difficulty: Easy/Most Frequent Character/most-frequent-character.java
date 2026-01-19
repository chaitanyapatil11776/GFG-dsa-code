class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
    char ans='{';
        int max=0;
        for(char c1:ss.keySet()){
            int ff=ss.get(c1);
            if(ff>max || (ff==max && c1<ans)){
                max=ff;
                ans=c1;
            }
        }
        return ans;
    }
}