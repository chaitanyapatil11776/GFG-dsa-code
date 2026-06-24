class Solution {
    String removeSpaces(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char a:s.toCharArray()){
            if(a!=' '){
            sb.append(a);
            }
        }
        return sb.toString();
    }
}