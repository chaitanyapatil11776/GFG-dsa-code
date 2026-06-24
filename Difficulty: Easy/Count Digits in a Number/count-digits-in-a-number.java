class Solution {
    public static int countDigits(int n) {
        // Code here
        int count=0;
        int x=n;
        while(x!=0)
        {
            count++;
            x/=10;
        }
        return count;
    }
}
