public class ClearLastBit {
    public static int clearLastIthBit(int n, int i){
        // ~0 will return the result with all one's then left shifting by last ith bit
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15, 2));
    }
}
