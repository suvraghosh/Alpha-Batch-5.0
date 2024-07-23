public class UpdateIthBit {
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static int setIthBit(int n, int i){
        int bitmask = (1 << i);
        return n | bitmask;
    }
    public static int updateIthNumberBit(int n, int i, int newBit){
        // 1st way
        /* 
        if(newBit == 0){
            return clearIthBit(n, i);
        }else{
            setIthBit(n, i);
        }
        */

        // 2nd way
        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthNumberBit(10, 2, 1));
    }
}
