class Solution {
    int maxLength(int arr[]) {
        // code here
        int n=arr.length;
        int pp[]=new int[n];
        pp[0]=arr[0];
        int maxl=0;
        for(int i=1;i<arr.length;i++ ){
            pp[i]=pp[i-1]+arr[i];
            
        }
        
        HashMap<Integer,Integer>mm=new HashMap<>();
        for(int j=0;j<n;j++){
            if(pp[j]==0)maxl=Math.max(maxl,j+1);
            int val=pp[j];
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