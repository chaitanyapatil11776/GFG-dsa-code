class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer>ss=new Stack<>();
        ArrayList<Integer>aa=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!ss.isEmpty() && ss.peek()<=arr[i]){
                ss.pop();
            }
            if(ss.isEmpty()){
                aa.add(-1);
            }else{
                aa.add(ss.peek());
            }
            
            ss.push(arr[i]);
        }
        Collections.reverse(aa);
        return aa;
        
    }
}