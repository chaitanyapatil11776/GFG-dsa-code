class Solution {
    int missingNum(int arr[]) {

        int n = arr.length + 1;   // because one number is missing

        long expectedSum = (long) n * (n + 1) / 2;   // use long to avoid overflow

        long actualSum = 0;

        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }

        return (int)(expectedSum - actualSum);
    }
}