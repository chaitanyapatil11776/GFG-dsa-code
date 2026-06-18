// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int low=0;
        int hight=arr.length-1;
        while(low<hight)
        {
            int mid=low+(hight-low)/2;
            if(arr[mid]>arr[mid+1]){
                hight=mid;
            }else{
                low=mid+1;
            }
        }
        return arr[low];
    }
}