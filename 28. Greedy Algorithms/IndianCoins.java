import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins{
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        // Sort the array in descending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int numOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount) {
                    numOfCoins++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }

        System.out.println("Total (min) coins used = " + numOfCoins);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}