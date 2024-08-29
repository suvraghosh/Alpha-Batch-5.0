
public class LargestInArr {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {3, 10, 90, 20, 5};

        System.out.println("Largest number is: " + getLargest(numbers));
    }     
}