import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        
        // check is empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push into the stack
        public static void push(int element){
            list.add(element);
        } 

        // Pop from stack
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Return top of the stack
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}