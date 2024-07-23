public class GetIthBit {
    public static int searchIthBit(int n, int i){
        // Left shift operator will shift by ith index and then check with nth number
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(searchIthBit(10, 3));
    }
}
