class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer>ss=new HashMap<>();
        ArrayList<ArrayList<Integer>>pp=new ArrayList<>();
        for(int a:arr){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }
        for(int a:ss.keySet()){
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(a);
            temp.add(ss.get(a));
            pp.add(temp);
        }
        return pp;
        
        
    }
}