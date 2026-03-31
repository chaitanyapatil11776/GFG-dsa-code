// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int patfreq[]=new int[26];
        int txtfreq[]=new int[26];
        int k=pat.length();
        for(int i=0;i<k;i++){
            int index=pat.charAt(i)-97;
            patfreq[index]++;
        }
           for(int i=0;i<k;i++){
            int index=txt.charAt(i)-97;
            txtfreq[index]++;
        }
        int count=0;
        if(Arrays.equals(txtfreq,patfreq)){
            count++;
        }
        int n=txt.length();
        for(int i=1;i<n-k+1;i++){
            int removeCharIndex=txt.charAt(i-1)-97;
            int addedCharIndex=txt.charAt(i+k-1)-97;
             txtfreq[removeCharIndex]--;
              txtfreq[addedCharIndex]++;
                 if(Arrays.equals(txtfreq,patfreq)){
            count++;
        }
        }
        return count;
    }
}