class Solution {
    int maxProduct(int[] arr) {
        int p = arr[0];
        int sum = 1;

        for (int i = 0; i < arr.length; i++) {
            sum *= arr[i];
            p = Math.max(p, sum);

            if (sum == 0)
                sum = 1;
        }

        sum = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum *= arr[i];
            p = Math.max(p, sum);

            if (sum == 0)
                sum = 1;
        }

        return p;
    }
}
