class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        
        char ans='z';
        int max=0;
        for(char c:ss.keySet()){
            int ff=ss.get(c);
            if(ff>max){
                max=ff;
                ans=c;
            }else if(ff==max && c<ans){
                ans=c;
            }
        }
        
        return ans;
    }
}