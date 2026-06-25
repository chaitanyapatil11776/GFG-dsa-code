class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int temp[]=new int[n];
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                temp[i]=arr[right--];
                
            }else{
                temp[i]=arr[left++];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
