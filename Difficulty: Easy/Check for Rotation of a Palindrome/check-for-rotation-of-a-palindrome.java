class Solution {
    public boolean isRotatedPalindrome(String s) {
        int n = s.length();
        String temp = s + s;

        for (int i = 0; i < n; i++) {
            if (isPalindrome(temp, i, i + n - 1)) {
                return true;
            }
        }

        return false;
    }

    private boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}