public class ClearIthBit {
    public static int clearIthNumberBit(int n, int i){
        // ~ Not operation will change all the bit after left shift  operation
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthNumberBit(10, 1));
    }
}
