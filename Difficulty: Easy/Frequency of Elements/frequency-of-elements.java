class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        
        HashMap<Integer,Integer>ss=new HashMap<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i:arr){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        
        for(int a:ss.keySet()){
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(a);
            temp.add(ss.get(a));
            ans.add(temp);
        }
        
        return ans;
    }
}