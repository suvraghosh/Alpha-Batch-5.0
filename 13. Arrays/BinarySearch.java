public class BinarySearch {
    // Time Complexity: O(log n)
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if(numbers[mid] == key){
                return mid;
            }

            if(key < numbers[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {3, 6, 9, 12, 15, 18};
        int search = 12;

        System.out.println("The index is: " + binarySearch(numbers, search));
    }
}
