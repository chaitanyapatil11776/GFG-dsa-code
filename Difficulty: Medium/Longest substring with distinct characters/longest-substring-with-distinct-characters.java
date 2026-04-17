class Solution {
    public int longestUniqueSubstr(String s) {
        // code heret
        int left=0,max=0;
        HashSet<Character>ss=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(ss.contains(s.charAt(right))){
                ss.remove(s.charAt(left));
                left++;
            }
            ss.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}