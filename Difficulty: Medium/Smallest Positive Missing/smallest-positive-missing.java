import java.util.*;

class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);   // Step 1: Sort array
        
        int smallest = 1;   // Step 2: Start from 1
        
        for (int num : arr) {
            if (num == smallest) {
                smallest++;   // Found → check next
            }
        }
        
        return smallest;   // First missing number
    }
}