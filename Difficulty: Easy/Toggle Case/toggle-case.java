class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char a:s.toCharArray()){
            
            
            if(Character.isLowerCase(a)){
                sb.append(Character.toUpperCase(a));
            }else if(Character.isUpperCase(a)){
                sb.append(Character.toLowerCase(a));
            }else{
                sb.append(a);
            }
            
        }
        return sb.toString();
    }
}
