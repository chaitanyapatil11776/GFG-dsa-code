class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<ArrayList<Integer>>ss=new ArrayList<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int a:map.keySet()){
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(a);
            temp.add(map.get(a));
            ss.add(temp);
            
            
        }
        return ss;
    }
}