class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char a:s1.toCharArray()){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }
        for(char b:s2.toCharArray()){
            ss.put(b,ss.getOrDefault(b,0)-1);
        }
        for(int x:ss.values()){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}