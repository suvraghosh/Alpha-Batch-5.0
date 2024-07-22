import java.util.*;


// Time Complexity: O(nlogn)

public class InBuiltSort {
    public static void printArr(Integer[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] arr = {4, 1, 5, 2, 6};

        // Arrays.sort(arr);
        Arrays.sort(arr, 0, 2);

        // This will take an object so we use Integer insetead of int which is primitive type
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
