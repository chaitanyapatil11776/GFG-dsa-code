class Solution {
    public int minParentheses(String s) {
        // code here
        int count=0;
        Stack<Character>ss=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                ss.push(c);
            }else{
                if(ss.isEmpty()){
                    count++;
                }else{
                    ss.pop();
                }
            }
        }
        return count+ss.size();
        
        
    }
}
