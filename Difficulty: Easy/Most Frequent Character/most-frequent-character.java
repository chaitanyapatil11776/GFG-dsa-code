class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        char ans='z';
        int max=0;
        for(char ch:ss.keySet()){
            int fre=ss.get(ch);
            if(fre>max ){
                max=fre;
                ans=ch;
            }else if(fre==max && ch<ans){
                ans=ch;
            }
            
        }
        return ans;
    }
}