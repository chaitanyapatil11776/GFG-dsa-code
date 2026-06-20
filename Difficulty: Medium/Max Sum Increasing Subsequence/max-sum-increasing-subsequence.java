class Solution {
    public int maxSumIS(int arr[]) {
        // code here



int ans=0;
int n=arr.length;
int d[]=new int[n];
for(int  i=0;i<n;i++){
    d[i]=arr[i];
    for(int j=0;j<i;j++){
        if(arr[j]<arr[i]){
            d[i]=Math.max(d[i],d[j]+arr[i]);
        }
        
    }
    ans=Math.max(ans,d[i]);
}
return ans;
        
    }
}