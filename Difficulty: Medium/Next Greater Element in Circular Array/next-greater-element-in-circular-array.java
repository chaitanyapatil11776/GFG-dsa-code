class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        // n
        Stack<Integer>ss=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=2*n-1;i>=0;i--){
            while(!ss.isEmpty() && ss.peek()<=arr[i%n]){
                ss.pop();
            }
            if(i<n){
                if(ss.isEmpty())
                {
                    ans.add(-1);
                }else{
                    ans.add(ss.peek());
                }
            }
            ss.push(arr[i%n]);

        }
                    Collections.reverse(ans);
        return ans;
    }
}