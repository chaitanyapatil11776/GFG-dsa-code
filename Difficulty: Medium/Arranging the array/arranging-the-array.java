// User function Template for Java

class Solution {

    public void Rearrange(int a[], int n) {
        // Your code goes heret
        int[]p=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                p[index++]=a[i];
            }
        }
          for(int i=0;i<n;i++){
            if(a[i]>=0){
                p[index++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            a[i]=p[i];
        }
        
        
    }
}