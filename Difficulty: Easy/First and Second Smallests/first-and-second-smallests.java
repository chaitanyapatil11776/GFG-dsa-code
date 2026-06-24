class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int sec=Integer.MAX_VALUE;
        int fr=Integer.MAX_VALUE;
        ArrayList<Integer>ss=new ArrayList<>();
        
        for(int a:arr){
            if(a<fr){
                sec=fr;
                fr=a;
            }else if(a<sec && a!=fr){
                sec=a;
            }
        }
        if(sec==Integer.MAX_VALUE){
            ss.add(-1);
            return ss;
        }
        ss.add(fr);
        ss.add(sec); 
        return ss;
        
    }
}
