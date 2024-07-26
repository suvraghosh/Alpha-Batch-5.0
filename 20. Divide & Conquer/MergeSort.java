// Time Complexity: O(n log n)
// Space Complexity: O(n)

public class MergeSort{
    public static void printArr(int[] arr){
        for(int n = 0; n < arr.length; n++){
            System.out.print(arr[n] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr, int si, int ei){
        // Base Case
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2; // (si + ei) / 2
        mergeSort(arr, si, mid); // Dividing left part
        mergeSort(arr, mid + 1, ei); // Diving right part

        merge(arr, si, mid, ei); // Merging two sorted array
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int temp[] = new int[ei - si + 1]; // Temporary array for storing sorted element
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover elements of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temporary to original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 4, 10, 1};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}