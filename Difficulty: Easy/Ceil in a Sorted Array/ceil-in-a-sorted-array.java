// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low=0;
        int hight=arr.length-1;
        int ans=-1;
        while(low<=hight){
            int mid=low+(hight-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                hight=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
}
