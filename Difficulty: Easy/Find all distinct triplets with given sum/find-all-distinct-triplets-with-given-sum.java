// User function Template for Java
class Solution {
    public List<List<Integer>> threeSum(int[] arr, int target) {
        // Your code here
        Arrays.sort(arr);
        if(arr==null || arr.length<3){
           return  new ArrayList<>();
        }
        Set<List<Integer>>ss=new HashSet<>();
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    ss.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        return new ArrayList<>(ss);
        
    }
}