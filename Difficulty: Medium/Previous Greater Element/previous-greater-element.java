class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
          Stack<Integer> ss = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            ans.add(-1);
        }

        for (int i = 0; i < arr.length; i++) {

            while (!ss.isEmpty() && arr[ss.peek()] <= arr[i]) {
                ss.pop();
            }

            if (!ss.isEmpty()) {
                ans.set(i, arr[ss.peek()]);
            }

            ss.push(i);
        }

        return ans;
    }
}