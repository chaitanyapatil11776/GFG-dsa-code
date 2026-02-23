class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
       
       int sec=-1;
       int lar=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>lar){
               sec=lar;
               lar=arr[i];
           }else if(arr[i]>sec && arr[i]!=lar){
               sec=arr[i];
           }
       }
       return sec;
    }
}