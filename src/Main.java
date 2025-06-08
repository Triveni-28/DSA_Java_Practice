import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Print numbers from 1 to N
        System.out.println("Enter N to print numbers from 1 to N:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Sum of first N natural numbers
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of first " + n + " numbers is: " + sum);

        // 3. Check if a number is even or odd
        System.out.println("Enter number to check even or odd:");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        // 4. Check if a number is prime
        System.out.println("Enter number to check prime:");
        int primeCheck = sc.nextInt();
        boolean isPrime = true;
        if (primeCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(primeCheck); i++) {
                if (primeCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(primeCheck + (isPrime ? " is Prime" : " is Not Prime"));

        // 5. Print factorial of a number
        System.out.println("Enter number to find factorial:");
        int factNum = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + factNum + " is " + factorial);

        // 6. Print multiplication table
        System.out.println("Enter number for multiplication table:");
        int tableNum = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // 7. Reverse a number
        System.out.println("Enter number to reverse:");
        int reverseNum = sc.nextInt();
        int reversed = 0;
        while (reverseNum != 0) {
            int digit = reverseNum % 10;
            reversed = reversed * 10 + digit;
            reverseNum /= 10;
        }
        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}