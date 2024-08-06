import java.util.Stack;

public class StockSpan {
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        // Always the 1st span will 1 because there are no previous elements
        span[0] = 1;
        s.push(0);

        // loop through to length of the stack
        for(int i = 1; i < stocks.length; i++){
            // store the current price of the stack
            int currPrice = stocks[i];
            // untill the stack is empty pop out the elements if current price is greater than previous
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            // if stack is empty just added the index 
            if(s.isEmpty()){
                span[i] = i + 1;
            }else{ // else find out previous high 
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            // push into the stack
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i = 0; i < span.length; i++){
            System.out.println(span[i]+ "");
        }
    }
}
