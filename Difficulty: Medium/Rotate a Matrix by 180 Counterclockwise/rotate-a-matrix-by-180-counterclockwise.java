class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        int top=0;
        int botton=n-1;
        while(top<botton){
            int temp[]=mat[top];
            mat[top]=mat[botton];
            mat[botton]=temp;
            top++;
            botton--;
        }
        
        
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
               left++;
               right--;
            }
        }
        
       
    }
}