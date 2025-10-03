import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacci(int count) {
            int firstterm = 0, secondterm = 1;

            if(count<=0){
                System.out.println("Please enter a positive Number.");
            }else if(count==1){
                System.out.println("Fibonacci Series up to " + count + " term:");
                System.out.println(firstterm);
            }else{
                for (int i = 1; i <=count ; i++) {
                    int nextterm = firstterm + secondterm;

                    firstterm = secondterm;
                    secondterm = nextterm;
                    System.out.print(nextterm + " ");
                }

        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int count = scanner.nextInt();
        printFibonacci(count);
        scanner.close();
    }
}
