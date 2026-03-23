class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int a=ff(arr,x);
        int b=fl(arr,x);
        ArrayList<Integer>rr=new ArrayList<>();
        rr.add(a);
        rr.add(b);
        return rr;
    }
     int ff(int arr[],int x){
         int low=0;
         int ans=-1;
         int hight=arr.length-1;
         while(low<=hight){
             int mid=low+(hight-low)/2;
             if(arr[mid]==x){
                //  return mid;
                ans=mid;
                hight=mid-1;
                 
             }else if(arr[mid]<x){
                 low=mid+1;
             }else{
                 hight=mid-1;
             }
         }
         return ans;
     }
     
     
     int fl(int arr[],int x){
         int low=0;
         int ans=-1;
         int hight=arr.length-1;
         while(low<=hight){
             int mid=low+(hight-low)/2;
             if(arr[mid]==x){
                //  return mid;
                ans=mid;
                // hight=mid-1;
            low=mid+1;
                 
             }else if(arr[mid]<x){
                 low=mid+1;
             }else{
                 hight=mid-1;
             }
         }
         return ans;
     }
}
