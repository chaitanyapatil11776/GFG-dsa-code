
class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int diff=(arr[i])*(arr[i+1]);
            max=Math.max(diff,max);
        }
        return max;
    }
    
}
