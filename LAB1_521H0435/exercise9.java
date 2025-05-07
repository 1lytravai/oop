import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println(n + " is odd, so we take 3*n+1: " + (3 * n + 1));
            n = 3 * n + 1;
        }
        displayHailstoneSequence(n);
        scanner.close();
    }

    public static void displayHailstoneSequence(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                System.out.println(n + " is even, so we take n/2: " + (n / 2));
                n /= 2;
            } else {
                System.out.println(n + " is odd, so we take 3*n+1: " + (3 * n + 1));
                n = 3 * n + 1;
            }
        }
    }
}
