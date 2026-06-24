class Solution {
    public String sortString(String s) {
        // code here#
        char c[]=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
        
    }
}