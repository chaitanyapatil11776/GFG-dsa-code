class Solution {
    String reverses(String s) {
        // your code here
        String p=s.replace(" ","");
        StringBuilder sb=new StringBuilder(p).reverse();
        int k=0;
        char aa[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(aa[i]!=' '){
                aa[i]=sb.charAt(k++);
            }
        }
        return new String(aa);
    }
}