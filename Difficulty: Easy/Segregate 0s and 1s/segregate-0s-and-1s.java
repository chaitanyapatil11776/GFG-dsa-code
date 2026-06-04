class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int count=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1){
                arr[count--]=1;
            }
        }
            
            while(count>=0)
            {
                arr[count--]=0;
            }

        }
    }

