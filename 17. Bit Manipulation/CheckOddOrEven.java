public class CheckOddOrEven{
    public static void OddOrEven(int n){
        // Checking the least significant bit if it's 0 then Even & if it's 1 then Odd
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        OddOrEven(11);
        OddOrEven(14);
    }
}