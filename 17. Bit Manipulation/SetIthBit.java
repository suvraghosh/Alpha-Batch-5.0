public class SetIthBit {
    public static int ReturnSetIthBit(int n, int i){
        // Set the new ith value using OR operation
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ReturnSetIthBit(10, 2));
    }
}
