class Solution {
   static void rever(int nums[],int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        rever(arr,0,d-1);
        rever(arr,d,n-1);
        rever(arr,0,n-1);
    }
}