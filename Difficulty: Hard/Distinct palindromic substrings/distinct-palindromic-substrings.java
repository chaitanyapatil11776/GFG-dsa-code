class Solution {
    public ArrayList<String> palindromicSubstr(String s) {
        // code here
        HashSet<String>ss=new HashSet<>();
        for(int i=0;i<s.length();i++){
            expand(s,i,i,ss);
            expand(s,i,i+1,ss);
        }
        
      return new  ArrayList<>(ss);
    }
    
    void expand(String s,int l,int r,HashSet<String>set){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            set.add(s.substring(l,r+1));
            l--;
            r++;
        }
    }
}