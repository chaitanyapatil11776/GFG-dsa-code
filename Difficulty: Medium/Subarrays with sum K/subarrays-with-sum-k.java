class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n=arr.length;
        int  pp[]=new int[n];
        int count=0;
        pp[0]=arr[0];
        for(int i=1;i<n;i++){
            pp[i]=pp[i-1]+arr[i];
            
        }
        HashMap<Integer,Integer>mm=new HashMap<>();
        for(int j=0;j<n;j++){
            if(pp[j]==k)count++;
            int val=pp[j]-k;
            
            if(mm.containsKey(val)){
                count+=mm.get(val);
            }
            mm.put(pp[j],mm.getOrDefault(pp[j],0)+1);
        }
        return count;
    }
}