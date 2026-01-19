class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int n=arr.length;
        int p[]=new int[n];
        int max=0;
        p[0]=((arr[0]==0)?-1:1);
        HashMap<Integer,Integer>ss=new HashMap<>();
        ss.put(0,1);
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+((arr[i]==0)?-1:1);
        }
        for(int i=0;i<n;i++){
            if(p[i]==0)max=Math.max(max,i+1);
            if(ss.containsKey(p[i])){
                max=Math.max(max,i-ss.get(p[i]));
            }
            if(!ss.containsKey(p[i])){
                ss.put(p[i],i);            }
        }
        
        return max;
    }
}