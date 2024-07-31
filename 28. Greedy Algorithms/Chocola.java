import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m - 1 
        Integer costHor[] = { 4, 1, 2 }; // n - 1

        // Sorting arrays based on the cost in descending order 
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        // Initializing pointers, cutting pieces & total Cost
        int verPointer = 0, horPointer = 0;
        int verPieces = 1, horPieces = 1;
        int totalCost = 0;

        // Loop through untill the condition is false
        while (verPointer < costVer.length && horPointer < costHor.length) {
            // Cut horizontally if the cost is more than vertical cost
            if(costVer[verPointer] <= costHor[horPointer]){
                totalCost += (costHor[horPointer] * verPieces);
                horPointer++;
                horPieces++;
            }
            // Cut vertically if the cost is more than horizontal cost
            else{
                totalCost += (costVer[verPointer] * horPieces);
                verPointer++;
                verPieces++;
            }
        }

        // if something is left on vertically
        while (verPointer < costVer.length) {
            totalCost += (costVer[verPointer] * horPieces);
            verPointer++;
            verPieces++;
        }

        // if something is on horizontally
        while (horPointer < costHor.length) {
            totalCost += (costHor[horPointer] * verPieces);
            horPointer++;
            horPieces++;
        }

        System.out.println("Minimum cost to cuts: " + totalCost);
    }
}