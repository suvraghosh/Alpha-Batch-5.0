public class BacktrackOnArray{
    // Time Complexity: O(n) Space Complexity: O(n)
    public static void trackArr(int arr[], int i, int val){
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val; // put the current value in the call stack
        trackArr(arr, i + 1, val + 1); // function call

        arr[i] = arr[i] - 2; // backtracking step
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        trackArr(arr, 0, 1);
        printArr(arr);
    }
}