import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if ( num % 3 == 0 && num % 5 == 0 ) {
            System.out.println("FizzBuzz");
        } else if ( num % 3 == 0) {
            System.out.println("Fizz");
        } else if ( num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("It is not divisible by 3 and 5");
        }
        
    }
}