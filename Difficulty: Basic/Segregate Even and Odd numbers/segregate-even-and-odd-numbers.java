class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
int n=arr.length;
        int p[]=new int[n];
        int index=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                p[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
            p[index++]=arr[i];
        }
        }
        
        for(int i=0;i<n;i++){
            arr[i]=p[i];
        }
    }
}