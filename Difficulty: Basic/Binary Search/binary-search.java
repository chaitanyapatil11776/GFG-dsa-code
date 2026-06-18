class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code 
        int low=0;
        int hight=arr.length-1;
        while(low<=hight){
            int mid=low+(hight-low)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                hight=mid-1;
            }
        }
        return false;
    }
}