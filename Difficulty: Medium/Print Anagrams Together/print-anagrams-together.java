class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>>ss=new HashMap<>();
        for(String word:arr){
            char []c=word.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            ss.putIfAbsent(key,new ArrayList<>());
            ss.get(key).add(word);
        }
        return new ArrayList<>(ss.values());
    }
}
