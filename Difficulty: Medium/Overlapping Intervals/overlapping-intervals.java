class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here]
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]>list=new ArrayList<>();
        for(int []interval:arr){
            if(list.isEmpty()   ||  list.get(list.size()-1)[1]<interval[0]) {
                list.add(interval);
            }else{
                 list.get(list.size()-1)[1]=Math.max( list.get(list.size()-1)[1],interval[1]);
            }
        }
        return list;
        
    }
}