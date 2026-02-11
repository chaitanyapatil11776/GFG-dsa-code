class Solution {
    int countPairs(int arr[], int target) {
        // code here
        int count=0;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(ss.containsKey(diff)){
                count+=ss.get(diff);
            }
            
            ss.put(arr[i],ss.getOrDefault(arr[i],0)+1);
        }
        return count;
        
    }
}