class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>ss=new Stack<>();
        for(int a:arr){
            ans.add(-1);
        }
        
        
        for(int i=0;i<arr.length;i++){
            while(!ss.isEmpty() && arr[ss.peek()]<=arr[i]){
                ss.pop();
            }
            
            if(!ss.isEmpty()){
                ans.set(i,arr[ss.peek()]);
            }
            
            ss.push(i);
        }
        
        return ans;
    }
}