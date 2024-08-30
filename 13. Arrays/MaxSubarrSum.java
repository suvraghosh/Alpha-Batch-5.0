public class MaxSubarrSum {
    // --- Brute Force Approach
    // Time Complexity: O(n^3)

    // public static void getMaxSum(int arr[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for (int i = 0; i < arr.length; i++) {
    //         int start = i;
    //         for (int j = i; j < arr.length; j++) {
    //             int end = j;
    //             currSum = 0;
    //             for (int k = start; k <= end; k++) {
    //                 currSum += arr[k];
    //             }
    //             if (maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("Maximum Sum is: " + maxSum);
    // }

    
    // Time Complexity: O(n^2)
    public static void getMaxSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        getMaxSum(numbers);
    }
}