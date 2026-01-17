class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
     int max=0;
     char ans='{';
     for(char c:ss.keySet()){
         int  ff=ss.get(c);
         if(ff>max ||  (ff==max && c<ans )){
             max=ff;
             ans=c;
         }
         
     }
     return  ans;
    }
}