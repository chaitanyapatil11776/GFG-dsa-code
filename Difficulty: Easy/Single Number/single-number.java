// User function Template for Java

class Solution {
    int getSingle(int arr[]) {

        int ans = 0;

        for (int num : arr) {
            ans ^= num;
        }

        return ans;
    }
}