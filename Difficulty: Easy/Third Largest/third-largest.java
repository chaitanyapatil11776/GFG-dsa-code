class Solution {
    int thirdLargest(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n - 3];
    }
}