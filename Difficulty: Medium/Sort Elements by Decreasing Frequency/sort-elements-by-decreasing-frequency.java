// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:arr){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int ii:arr){
            list.add(ii);
        }
        Collections.sort(list,(a,b)->{
            if(ss.get(a)==ss.get(b)){
                return a-b;
            }
            return ss.get(b)-ss.get(a);
        });
        return list;
    }
}