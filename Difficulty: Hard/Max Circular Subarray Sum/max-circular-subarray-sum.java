class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int max=arr[0];
        int min=arr[0];
        int total=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max)max=sum;
            if(sum<0)sum=0;
            total+=arr[i];
        }
        
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<min)min=sum;
            if(sum>0)sum=0;
            
        }
        if(max<0)return max;
        return Math.max(max,(total-min));
    }
}
