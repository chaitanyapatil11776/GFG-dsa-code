// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        int count=0;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int h: arr ){
            count+=ss.getOrDefault(h+k,0);
            count+=ss.getOrDefault(h-k,0);
            ss.put(h,ss.getOrDefault(h,0)+1);
            
        }
        return count;
    }
}