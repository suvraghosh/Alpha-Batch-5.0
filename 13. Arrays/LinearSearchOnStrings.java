public class LinearSearchOnStrings {
    public static int linearSearchOnArr(String fruit[], String key){
        for(int i = 0; i < fruit.length; i++){
            if(fruit[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[] = {"Apple", "Mango", "Banana"};
        String search = "Mango";
        int index = linearSearchOnArr(fruits, search);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is found on index: " + index);
        }
    }
}
