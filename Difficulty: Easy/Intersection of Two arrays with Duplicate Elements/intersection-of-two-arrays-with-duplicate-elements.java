class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : a) {
            set1.add(num);
        }

        for(int num : b) {
            if(set1.contains(num)) {
                result.add(num);
            }
        }

        return new ArrayList<>(result);
    }
}