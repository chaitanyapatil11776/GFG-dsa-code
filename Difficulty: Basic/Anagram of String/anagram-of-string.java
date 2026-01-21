/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        // add code here.\
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c1:s1.toCharArray()){
            ss.put(c1,ss.getOrDefault(c1,0)+1);
        }
        for(char c2:s2.toCharArray()){
            ss.put(c2,ss.getOrDefault(c2,0)-1);
        }
        int del=0;
        for(int bb:ss.values()){
            del+=Math.abs(bb);
        }
        return del;
    }
}