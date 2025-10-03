import java.util.Scanner;

public class PrintPrimeNumbers {

    public static void printPrimes(int range) {

        if (range < 2) {
            System.out.println("Please enter a positive number greater than or equal to 2.");
            return;
        }

        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;

            // Check divisibility up to sqrt(i)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;          // Stop checking further
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range to print prime numbers up to:  ");
        int range = scanner.nextInt();

        printPrimes(range);
        scanner.close();
    }
}
