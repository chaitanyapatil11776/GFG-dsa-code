class Solution {
    String removeDuplicates(String s) {
        
        StringBuilder sb=new StringBuilder ();
        HashSet<Character>ss=new HashSet<>();
        for(char c:s.toCharArray()){
            if(!ss.contains(c)){
                ss.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
