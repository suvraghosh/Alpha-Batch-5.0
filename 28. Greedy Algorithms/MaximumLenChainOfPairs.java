import java.util.Arrays;
import java.util.Comparator;

public class MaximumLenChainOfPairs {
    public static void main(String[] args) {
        // Time complexity: O(n log n)
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        
        // Sort the array base on the ending chain length
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        // selecting the 1st chain
        int chainLen = 1;
        int pairEnd = pairs[0][1];
        
        // loop through the arrays
        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > pairEnd){
                chainLen++;
                pairEnd = pairs[i][1];
            }
        }

        System.out.println("Maximum length Chain of Pairs: " + chainLen);
    }
}