import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        // loop through to the string length
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // This is valid parenthesis so we can check from the closing parenthesis
            if(ch == ')'){
                int count = 0;
                // pop out the elements untill it matches and increase the count
                while (s.pop() != '(') {
                    count++;
                }
                // This will ensure that if count is 0 then there must be extra duplicate parenthesis
                if(count < 1){
                    return true;
                }
            } else{ // opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // valid parenthesis
        String str = "((a + b))"; // true
        String str1 = "(a + b)"; // false

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
