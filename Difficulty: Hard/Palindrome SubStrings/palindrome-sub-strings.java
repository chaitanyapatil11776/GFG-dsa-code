class Solution {
    public int countPS(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            count += expand(s, i, i);     // odd
            count += expand(s, i, i+1);   // even
        }

        return count;
    }

    int expand(String s, int l, int r){
        int count = 0;

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            if(r - l + 1 >= 2) {   // ⭐ important condition
                count++;
            }
            l--;
            r++;
        }

        return count;
    }
}