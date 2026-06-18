class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int low=0;
        int hight=arr.length-1;
        int ans=arr.length;
        while(low<=hight){
            int mid=low+(hight-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                hight=mid-1;
            }else{
                low=mid+1;
            }
        }
       return ans;
    }
}
