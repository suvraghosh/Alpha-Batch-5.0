import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write you Input: ");
        int range = sc.nextInt();
        
        while (counter <= range) {
            System.out.print(counter+ " ");
            counter++;
        }
    }
}
