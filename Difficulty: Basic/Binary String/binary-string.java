class Solution {
    public static int binarySubstring(String s) {
        int ones = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '1') ones++;
        }

        return (ones * (ones - 1)) / 2;
    }
}