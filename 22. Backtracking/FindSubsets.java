public class FindSubsets {
    // Time Complexity: O(n * 2^n)      Space Complexity: O(n)
    public static void findSubset(String str, String ans, int i){
        // base case
        if (i == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // recursion - choice yes or no

        // if yes
        findSubset(str, ans + str.charAt(i), i + 1);

        // if no
        findSubset(str, ans, i + 1);
    }
    public static void main(String[] args) {
        String str = "ABC";
        findSubset(str, "", 0);
    }
}
