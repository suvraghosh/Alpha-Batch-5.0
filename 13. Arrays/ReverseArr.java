public class ReverseArr {
    // Time Complexity: O(n) Space Complexity: O(1)
    public static void reverse(int arr[]){
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {3, 10, 5, 9};

        reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] +  " ");
        }
        System.out.println("");
    }
}