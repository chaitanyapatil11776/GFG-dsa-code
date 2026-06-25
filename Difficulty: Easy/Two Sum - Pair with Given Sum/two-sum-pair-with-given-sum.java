class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer>ss=new HashSet<>();
        for(int a:arr){
            if(ss.contains(target-a)){
                return true;
            }               ss.add(a);
            
        }return false;
    }
}