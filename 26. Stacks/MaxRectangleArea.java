import java.util.Stack;

public class MaxRectangleArea{
    public static void calculateArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Smaller element in right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Smaller element in left
        s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate Area : Area = Height * Width
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Maximum area is: " +  maxArea);
    }
    public static void main(String[] args) {
       int histogram[] = {2, 4}; 

       calculateArea(histogram);
    }
}