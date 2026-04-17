class Solution {

    public int countSubstr(String s, int k) {   // ✅ FIXED name
        return atMost(s, k) - atMost(s, k - 1);
    }

    int atMost(String s, int k) {
        int[] freq = new int[26];
        int left = 0, res = 0;

        for (int right = 0; right < s.length(); right++) {
            if (freq[s.charAt(right) - 'a']++ == 0) k--;

            while (k < 0) {
                if (--freq[s.charAt(left++) - 'a'] == 0) k++;
            }

            res += right - left + 1;
        }
        return res;
    }
}