import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        DivisionCalculator calculator = new DivisionCalculator(dividend, divisor);

        // Calculate and display the remainder
        int remainder = calculator.calculateRemainder();
        System.out.println("\nRemainder of the division: " + remainder);

        // Close the scanner
        scanner.close();
    }
}

class DivisionCalculator {
    private int dividend;
    private int divisor;

    public DivisionCalculator(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int calculateRemainder() {
        return dividend % divisor;
    }
}

