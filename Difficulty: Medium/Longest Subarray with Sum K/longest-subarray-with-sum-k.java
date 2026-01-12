// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code herefor
        int n=arr.length;
        int pp[]=new int[n];
        int maxl=0;
        pp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pp[i]=pp[i-1]+arr[i];
            
        }
        HashMap<Integer,Integer>mm=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            if(pp[j]==k)maxl=Math.max(maxl,j+1);
            int val=pp[j]-k;
            if(mm.containsKey(val)){
                maxl=Math.max(maxl,j-mm.get(val));
                
            }
        
        
        if(!mm.containsKey(pp[j])){
            mm.put(pp[j],j);
        }
        }
        return maxl;
        
        
    }
}
