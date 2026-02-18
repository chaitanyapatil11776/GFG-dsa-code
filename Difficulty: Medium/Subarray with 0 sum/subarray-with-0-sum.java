class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code heret<wr()
        int n=arr.length;
        int p[]=new int[n];
        p[0]=arr[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+arr[i];
        }
        HashSet<Integer>ss=new HashSet<>();
        for(int i=0;i<n;i++){
            if(p[i]==0)return true;
            if(ss.contains(p[i])){
                return true;
            }
            ss.add(p[i]);
        }
        
        return false;
    }
}