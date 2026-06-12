class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:arr){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        int n=arr.length;
        for(int i:ss.keySet()){
            if(ss.get(i)>n/2){
                return i;
            }
        }
        return -1;
    }
}