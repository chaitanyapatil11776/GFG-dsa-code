class Solution {
    public static int countWords(String s) {
        // code here
        int count=1;
        for(char c:s.toCharArray()){
            if(c==' ')count++;
        }
        return count;
    }
}