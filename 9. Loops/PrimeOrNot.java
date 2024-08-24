import java.util.Scanner;

class PrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int number = sc.nextInt();

        if(number == 0 || number == 1){
            System.out.println("Not a Prime Number");
        }else{
            Boolean isPrime = true;
            for(int i = 2; i <= number - 1; i++){
                if(number % i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("This Number is a Prime Number");
            }else{
                System.out.println("Not a Prime Number");
            }
        }
    }
}