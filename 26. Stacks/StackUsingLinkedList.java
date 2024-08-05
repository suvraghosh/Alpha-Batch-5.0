public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }        
    }
    static class Stack {
        static Node head = null;

        // isEmmpty function
        public static boolean isEmpty(){
            return head == null;
        }
        // push function
        public static void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        // pop function
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // peek function
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
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
