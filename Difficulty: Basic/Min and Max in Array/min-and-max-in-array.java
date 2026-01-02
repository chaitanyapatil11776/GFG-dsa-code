class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        
        int max=arr[0];
        int min=arr[0];
        ArrayList<Integer>re=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        re.add(min);
        re.add(max);
        return re;
    }
}
