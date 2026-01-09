class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        int p=0;
        int c=0;
        HashMap<Integer,Integer>mm=new HashMap<>();
        mm.put(0,1);
        for(int i=0;i<arr.length;i++){
            p+=arr[i];
            if(mm.containsKey(p)){
                c+=mm.get(p);
            }
            mm.put(p,mm.getOrDefault(p,0)+1);
        }
        return c;
        
        
    }
}
