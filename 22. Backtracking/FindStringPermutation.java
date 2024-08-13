public class FindStringPermutation {
    // Time Complexity: O(n * n!)
    public static void findPermutation(String str, String ans){
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i = 0; i < str.length(); i++){
            // store the current character from the string
            Character curr = str.charAt(i);
            // Form the new string excluding current character
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // Backtrack
            findPermutation(newStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
