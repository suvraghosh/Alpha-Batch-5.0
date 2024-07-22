public class SearchInMatrix {
    public static boolean stairCaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not Found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40},
                            { 50, 60, 70, 80},
                            { 90, 100, 110, 120 },
        };
        stairCaseSearch(matrix, 100);
    }
}