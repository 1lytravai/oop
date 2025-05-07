import java.util.Scanner;

public class exercise8 {
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long calculateProduct(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static int calculateSeriesA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static double calculateSeriesB(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Sum of numbers from 1 to n: " + calculateSum(n));
        System.out.println("Product of numbers from 1 to n: " + calculateProduct(n));
        System.out.println("Sum of series 1 + 2 + 3 + ... + n: " + calculateSeriesA(n));
        System.out.println("Sum of series 1 + 1/2 + 1/3 + ... + 1/n: " + calculateSeriesB(n));
        
        scanner.close();
    }
}
