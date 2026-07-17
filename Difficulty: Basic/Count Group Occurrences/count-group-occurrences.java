class Sol {
    int getCount(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        int count = 0;

        for (int groups : map.values()) {
            if (groups == k) {
                count++;
            }
        }

        return count;
    }
}