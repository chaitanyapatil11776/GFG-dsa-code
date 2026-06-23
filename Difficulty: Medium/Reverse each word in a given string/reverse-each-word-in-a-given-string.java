class Solution {
    public String reverseWords(String s) {
        // Code here
        String a[]=s.trim().split("\\s+");
        ArrayList<String>ss=new ArrayList<>();
        for(String p:a)
{
    StringBuilder l=new StringBuilder(p);
    ss.add(l.reverse().toString());
}
return String.join(" ",ss);

    }
}
