
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        int sum=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>target && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                ss.add(left+1);
                ss.add(right+1);
                return ss;
            }
        }
        ss.add(-1);
        return ss;
        
    }
}
