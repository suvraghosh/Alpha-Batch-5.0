public class lexiographicallyLargestString {
    // Time Complexity: O(x * n)
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++){
            // First string is less than the second so largest string is mango
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
