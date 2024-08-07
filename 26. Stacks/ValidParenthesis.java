import java.util.Stack;

public class ValidParenthesis {
    public static boolean validParenthesisCheck(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            // store the current chracter from the string
            char ch = str.charAt(i);

            // opening braces
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            // closing braces
            else{
                // no element in the stack
                if(s.isEmpty()){
                    return false;
                }

                // Parenthesis matched
                if((s.peek() == '(' && ch == ')')
                    || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']')){
                        
                        s.pop();
                }else{
                    return false;
                }
            }
        }
        // check if stack is empty after valid parenthesis matched
        if (s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "[{}([])]";
        System.out.println(validParenthesisCheck(str));
    }
}
