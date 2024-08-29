public class Subarrays {
    // Time Complexity: O(n^3)
    public static void printSubArr(int arr[]){
        int total_subarr = 0;
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print("[" + arr[k] + "]");
                }
                total_subarr++;
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Number of sub arrays: " + total_subarr);
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        printSubArr(nums);
    }
}
