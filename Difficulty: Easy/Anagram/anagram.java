class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s1.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
for(char cc:s2.toCharArray()){
    ss.put(cc,ss.getOrDefault(cc,0)-1);
    
}

for(int x:ss.values()){
    if(x!=0)return false;
}
return true;
    }
}