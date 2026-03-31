class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        
        // Step 1: length check
        if(s1.length() != s2.length()) return false;

        int freq[] = new int[26];

        // Step 2: count s1
        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }

        // Step 3: subtract s2
        for(char c : s2.toCharArray()){
            freq[c - 'a']--;
        }

        // Step 4: count extra chars in s1
        int extra = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                extra += freq[i];
            }
        }

        // Step 5: check
        return extra <= k;
    }
}