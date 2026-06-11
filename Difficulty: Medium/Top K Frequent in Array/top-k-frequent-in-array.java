class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:arr){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
ArrayList<Integer> list = new ArrayList<>(ss.keySet());

Collections.sort(list,(a,b)->{
   if(ss.get(a)==ss.get(b)){
       return b-a;
       
   }return ss.get(b)-ss.get(a);
});

ArrayList<Integer>aa=new ArrayList<>();

for(int i=0;i<k;i++){
    aa.add(list.get(i));
}
return aa;

    }
}
