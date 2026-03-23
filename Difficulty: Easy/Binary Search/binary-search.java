class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int low=0;
        int hight=arr.length-1;
        int ans=-1;
        while(low<=hight){
            int mid=low+(hight-low)/2;
            if(arr[mid]==k){
                // return mid;
                ans=mid;
                hight=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                hight=mid-1;
            }
        }
        return ans;
    }
}