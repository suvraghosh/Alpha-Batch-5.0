import java.util.*;

public class ReverseStack{
    // Push element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data){
        // if stack is empty push the value
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // pop out the top of the stack
        int top = s.pop();
        // called the recursive function
        pushAtBottom(s, data);
        // atlast push the top value
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        // pop out the top of the stack
        int top = s.pop();
        // called the recursive function
        reverseStack(s);
        // pushes at the bottom of stack
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}