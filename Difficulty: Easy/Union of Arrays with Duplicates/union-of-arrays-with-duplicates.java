class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer>ss=new HashSet<>();
        for(int aa:a){
            ss.add(aa);
            
        }
        for(int bb:b){
            ss.add(bb);
        }
        ArrayList<Integer>pp=new ArrayList<>(ss);
        return pp;
        
    }
}