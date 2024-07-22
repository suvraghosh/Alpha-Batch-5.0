
// Time Complexity: O(n^2)

public class SelectionSort {
    public static void SelectionSearch(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 6};
        SelectionSearch(arr);
        printArr(arr);
    }
}