import java.util.*;

public class ReverseString {
    public static String reverseString(String str){
        // Stored character in a stack
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        // untill the index reaches the length of string
        while (idx < str.length()) {
            // push into the stack in the form of character
            stack.push(str.charAt(idx));
            idx++;
        }
        // Stored the charcter of string
        StringBuilder result = new StringBuilder("");
        // untill the stack is empty
        while (!stack.isEmpty()) {
            // pop the character from the stack
            char ch = stack.pop();
            // append into the string
            result.append(ch);
        }
        // convert it into the string 
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "Suvra";
        String result = reverseString(s.toUpperCase());
        System.out.println(result);
    }
}
