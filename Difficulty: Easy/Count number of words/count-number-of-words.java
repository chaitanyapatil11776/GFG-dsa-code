class Solution {
    int countWords(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // must be lowercase letter
            if (c >= 'a' && c <= 'z') {

                // ignore escaped n or t (\n, \t)
                if (i > 0 && s.charAt(i - 1) == '\\') {
                    continue;
                }

                // start of word
                if (i == 0 ||
                    s.charAt(i - 1) == ' ' ||
                    s.charAt(i - 1) == '\n' ||
                    s.charAt(i - 1) == '\t' ||
                    (s.charAt(i - 1) == 'n' && i > 1 && s.charAt(i - 2) == '\\') ||
                    (s.charAt(i - 1) == 't' && i > 1 && s.charAt(i - 2) == '\\')) {

                    count++;
                }
            }
        }
        return count;
    }
}
