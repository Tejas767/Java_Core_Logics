import java.util.Scanner;

public class PrimeNumberCheck {

    public static void primecheck(int n) {


        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
            System.out.println(n + " is not a prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    System.out.println(n + " is not a prime number.");
                    break;
                }

            }

            if (isPrime) {
                System.out.println(n + " is a prime number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  prime number: ");
        int primenumber = scanner.nextInt();

        primecheck(primenumber);
    }
}