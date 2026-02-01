// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int p[]=new int[n];
        int maxlen=0;
        p[0]=arr[0];
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+arr[i];
            
        }
        ss.put(0,1);
        for(int i=0;i<n;i++){
            if(p[i]==k)maxlen=Math.max(maxlen,i+1);
            int val=p[i]-k;
            if(ss.containsKey(val)){
                maxlen=Math.max(maxlen,i-ss.get(val));
            }
            if(!ss.containsKey(p[i])){
                ss.put(p[i],i);
            }
        }
        return maxlen;
    }
}
