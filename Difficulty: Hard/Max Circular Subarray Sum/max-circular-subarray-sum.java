class Solution {
    public int maxCircularSum(int arr[]) {

        int total = arr[0];

        int maxcurr = arr[0];
        int maxsum = arr[0];

        int mincurr = arr[0];
        int minsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            total += arr[i];

            maxcurr = Math.max(arr[i], maxcurr + arr[i]);
            maxsum = Math.max(maxsum, maxcurr);

            mincurr = Math.min(arr[i], mincurr + arr[i]);
            minsum = Math.min(minsum, mincurr);
        }

        // All elements are negative
        if (maxsum < 0)
            return maxsum;

        return Math.max(maxsum, total - minsum);
    }
}
