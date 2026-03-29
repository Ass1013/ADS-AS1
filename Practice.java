import java.util.Scanner;

public class Practice {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select task (1, 2, 3, 4):");
        System.out.println("1 - Sum of Squares");
        System.out.println("2 - Sum of Array");
        System.out.println("3 - Sum of Powers");
        System.out.println("4 - Reverse Input");
        System.out.print("Your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Task 1: Sum of squares 1² + 2² + ... + n²
                System.out.print("Enter n: ");
                int n1 = sc.nextInt();
                System.out.println("Result: " + Main.sumOfSquares(n1));
                break;

            case 2:
                // Task 2: Sum of array elements
                System.out.print("Enter array size: ");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.print("Enter elements: ");
                for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
                System.out.println("Result: " + Main.sumOfArray(arr, 0, size));
                break;

            case 3:
                // Task 3: Sum of powers b⁰ + b¹ + ... + bⁿ
                System.out.print("Enter base b: ");
                int b = sc.nextInt();
                System.out.print("Enter n: ");
                int n3 = sc.nextInt();
                System.out.println("Result: " + (long) Main.sumOfPowers(b, n3));
                break;

            case 4:
                // Task 4: Reverse input without arrays and loops
                System.out.print("Enter N: ");
                int n4 = sc.nextInt();
                System.out.print("Enter " + n4 + " numbers: ");
                System.out.print("Output: ");
                Main.reverseInput(sc, n4);
                System.out.println();
                break;

            default:
                System.out.println("Invalid choice,please enter 1, 2, 3 or 4");
                break;
        }

        sc.close();
    }
}