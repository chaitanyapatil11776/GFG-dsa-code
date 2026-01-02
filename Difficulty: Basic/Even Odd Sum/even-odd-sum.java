// User function Template for Java

class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        int even=0;
        int old=0;
        for(int i=0;i<Arr.length;i++){
            if(i%2==0){
                even+=Arr[i];
                
            }else{
                old+=Arr[i];
            }
        }
        // return even,old;
        ArrayList<Integer>re=new ArrayList<>();
        re.add(even);
        re.add(old);
        return re;
        
    }
}