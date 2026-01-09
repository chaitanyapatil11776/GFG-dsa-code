// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int sum=0;
        int maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=i+1;
            }
            if(map.containsKey(sum-k)){
                maxlen=Math.max(maxlen,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
        
    }
}
