import java.util.Arrays;
import java.util.Comparator;

public class FracktionalKnacksack {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        // Making 2-d array
        double ratio[][] = new double[value.length][2];
        for(int i = 0; i < ratio.length; i++){
            ratio[i][0] = i; //storing the index
            ratio[i][1] = value[i]/(double)weight[i]; //storing the ratio and make it double so that fractional value store as it is
        }

        // Sorting based on the ratios
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        // We've to loop through in a descending manner so that higher ratios will store first
        for(int i = ratio.length - 1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){ //include full item
                finalVal += value[idx];
                capacity -= weight[idx];
            }else{
                finalVal += capacity * ratio[i][1]; 
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value is: " + finalVal);
    }
}
