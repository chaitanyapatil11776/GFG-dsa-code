class Solution {
    public void segregateElements(int[] arr) {
        // code here
        int count=0;
        int temp[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>=0){
                temp[count++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
            temp[count++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
}