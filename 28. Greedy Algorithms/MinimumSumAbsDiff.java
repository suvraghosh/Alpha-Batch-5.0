import java.util.Arrays;

public class MinimumSumAbsDiff {
    public static void main(String[] args) { 
        //Time Complexity: O(n log n)
        int A[] = {1, 7, 5};
        int B[] = {2, 3, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i = 0; i < A.length; i++){
            // A[i] - B[i] =  (1 - 2) + (2 - 1) + (3 - 3) = -1 + 1 + 0 = 0 
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Sum of Absolute Difference: " + minDiff);
    } 
}