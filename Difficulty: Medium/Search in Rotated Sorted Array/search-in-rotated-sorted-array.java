class Solution {
    int search(int[] arr, int key) {
        // code hereM
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)return i;
        }
        return -1;
    }
}