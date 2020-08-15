public class SmallestPairArray { 
  
// Returns minimum possible  
// sum in array B[] 
    static int minSum(int[] A, int n) { 
        int min_val = Arrays.stream(A).min().getAsInt(); 
        return (min_val * (n - 1)); 
    } 
  
    // Driver Code 
    static public void main(String[] args) { 
        int[] A = {1, 7, 2, 9, 6}; 
        int n = A.length; 
        System.out.println((minSum(A, n))); 
  
    } 
} 