class LinearSearch{
    // Time Complexity: O(n)
    public static int linearSearchOnArr(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {3, 5, 15, 89, 39};
        int key = 89;

        int index = linearSearchOnArr(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        }else{
            System.out.println("The index is: " + index);
        }
    }
}