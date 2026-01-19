class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int  n=arr.length;
        int p[]=new int[n];
        p[0]=arr[0];
        HashMap<Integer,Integer>ss=new HashMap<>();
        ss.put(0,1);
        int count=0;
        for(int i=1;i<n;i++){
            p[i]=p[i-1]^arr[i];
            
        }
        for(int i=0;i<n;i++){
            int val=p[i]^k;
            if(ss.containsKey(val)){
                count+=ss.get(val);
            }
            ss.put(p[i],ss.getOrDefault(p[i],0)+1);
        }
        return count;
    }
}