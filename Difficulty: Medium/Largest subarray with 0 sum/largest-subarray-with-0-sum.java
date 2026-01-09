class Solution {
    int maxLength(int arr[]) {
        // code here
        int maxlen=0;
        
int sum=0;
   HashMap<Integer,Integer>ss=new HashMap<>();
 
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                 maxlen=i+1;
            }
            if(ss.containsKey(sum)){
                maxlen=Math.max(maxlen,i-ss.get(sum));
            }else{
                ss.put(sum,i);
            }
        }
        return maxlen;
        
        
    }
}
