import java.util.Scanner;

public class Main {
    static int sumOfSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumOfSquares(n - 1);
    }

    static int sumOfArray(int[] arr, int index, int n) {
        if (index == n) return 0;
        return arr[index] + sumOfArray(arr, index + 1, n);
    }

    static double sumOfPowers(int b, int n) {
        if (n == 0) return 1;
        return Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    static void reverseInput(Scanner sc, int n) {
        if (n == 0) return;
        int num = sc.nextInt();
        reverseInput(sc, n - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Practice.run();
    }
}