public class linearSort {
    public static void main(String[] args){
        int[] arr = {20, 30, 60, 50, 5, 11, -9, 7};
        int target = -9;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }
}
