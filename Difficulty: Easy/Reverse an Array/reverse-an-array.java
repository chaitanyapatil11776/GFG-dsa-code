class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int te=arr[s];
            arr[s]=arr[e];
            arr[e]=te;
            s++;
            e--;
        }
    }
}