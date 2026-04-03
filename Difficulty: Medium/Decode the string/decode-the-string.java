class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer>St=new Stack<>();
        Stack<String>Sc=new Stack<>();
        
        int curr=0;
        String currs="";
        for(char c:s.toCharArray()){
            if(c=='['){
                St.push(curr);
                Sc.push(currs);
                curr=0;
                currs="";
            }else if(c==']'){
                int num=St.pop();
                String prv=Sc.pop();
                StringBuilder temp=new StringBuilder(prv);
                for(int i=0;i<num;i++){
                    temp.append(currs);
                }
                currs=temp.toString();
                
            }else if(Character.isDigit(c)){
                curr=curr*10+(c-'0');
            }else{
             currs+=c;   
            }
        }
        return currs;
    }
}