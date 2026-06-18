class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int low=0;
        int  hight=arr.length-1;
        int ans=-1;
        while(low<=hight){
            int mid=low+(hight-low)/2;
            if(arr[mid]<=x){
                ans=mid;
              low=mid+1;
            }else{
                hight=mid-1;
            }
        }
        return ans;
    }
}
