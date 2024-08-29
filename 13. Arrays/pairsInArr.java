public class pairsInArr {
    // Time Complexity: O(n^2)
    public static void printPairs(int arr[]){
        int total_pairs = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                total_pairs++;
            }
            System.out.println(" ");
        }
        System.out.println("Total number of pairs: " + total_pairs);
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        printPairs(nums);
    }
}
