class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
