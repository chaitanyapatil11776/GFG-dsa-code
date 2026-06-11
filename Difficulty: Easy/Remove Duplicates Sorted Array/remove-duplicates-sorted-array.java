class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        HashSet<Integer>aa=new HashSet<>();
        for(int i:arr){
            if(aa.add(i)){
                ss.add(i);
            }
        }
        return ss;
    }
}
