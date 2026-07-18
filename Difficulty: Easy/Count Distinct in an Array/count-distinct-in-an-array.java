class Solution {
    static int countDistinct(int arr[]) {
        // code here
        HashSet<Integer>ss=new HashSet<>();
        for(int a:arr){
            ss.add(a);
        }
        return ss.size();
    }
}