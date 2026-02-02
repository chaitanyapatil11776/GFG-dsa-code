class Solution {
    public String reverseWords(String s) {
        // Code here
        String arr[]=s.trim().split("\\s+");
        ArrayList<String>ss=new ArrayList<>();
        for(String p:arr){
            StringBuilder sb=new StringBuilder(p);
            ss.add(sb.reverse().toString());
        }
        return String.join(" ",ss);
        
    }
}
