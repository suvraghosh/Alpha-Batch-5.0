public class SmallestInArr {
    public static int getSmallest(int arr[]){
        int Smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(Smallest > arr[i]){
                Smallest = arr[i];
            }
        }

        return Smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {3, 10, 90, 20, 5};

        System.out.println("Smallest number is: " + getSmallest(numbers));
    }     
}
