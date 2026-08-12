class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>ss=new Stack<>();
        for(int a:arr){
            ans.add(-1);
        }
        
        for(int i=0;i<arr.length;i++){
            while(!ss.isEmpty()  && arr[ss.peek()]>arr[i]){
                int index=ss.pop();
                ans.set(index,arr[i]);
            }
            ss.push(i);
        }
        return ans;
    }
}