class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
    HashSet<Integer>ss=new HashSet<>();
    for(int i:arr){
        ss.add(i);
    }
    ArrayList<Integer>ans=new ArrayList<>();
    for(int i:ss){
        ans.add(i);
    }
    return ans;
    }
}