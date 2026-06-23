import java.util.*;

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters of s1
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Remove matching characters of s2
        for (char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        int extra = 0;

        // Count characters that are extra in s1
        for (int freq : map.values()) {
            if (freq > 0) {
                extra += freq;
            }
        }

        return extra <= k;
    }
}