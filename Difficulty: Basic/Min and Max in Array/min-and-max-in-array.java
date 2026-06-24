class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer>ss=new ArrayList<>();
        for(int a:arr){
            if(a>max){
                max=a;
            }if(a<min){
                min=a;
            }
        }
        ss.add(min);
        ss.add(max);
        return ss;
    }
}
