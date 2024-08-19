public class PalindromeString {
    // Time Complexity: O(n)
    public static boolean isPalindrome(String str){
        // Divided the string from the middle part and check
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mam";
        System.out.println(isPalindrome(str));
    }
}