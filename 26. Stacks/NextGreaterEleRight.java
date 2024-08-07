import java.util.Stack;

public class NextGreaterEleRight {
    // Time Complexity - O(n)
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreater[] = new int[arr.length];
        
        // loop through the array from right to left
        for(int i = arr.length - 1; i >= 0; i--){
            // 1. check untill the stack is not empty and if top of the stack is less than the current element then remove from the stack
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            } 
            // if stack is empty then there is no next greater element
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            // else there is next greater is found
            else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
