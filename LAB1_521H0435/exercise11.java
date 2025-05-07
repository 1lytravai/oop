public class exercise11 {
    public static void main(String[] args) {
        DigitCounter digitCounter = new DigitCounter(12345);
        int count = digitCounter.countDigits();
        System.out.println("Number of digits: " + count);
        
        int reversedNumber = reverseNumber(12345);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        return reversedNumber;
    }
}

class DigitCounter {
    private int number;

    public DigitCounter(int number) {
        this.number = number;
    }

    public int countDigits() {
        return String.valueOf(number).length();
    }
}
