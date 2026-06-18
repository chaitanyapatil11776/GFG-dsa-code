class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int a:arr){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }
        
       return ss.getOrDefault(target,0);
    }
}
