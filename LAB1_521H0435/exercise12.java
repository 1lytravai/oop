public class exercise12 {
    public static void main(String[] args) {
        NumberReverser numberReverser = new NumberReverser(12345);
        int reversedNumber = numberReverser.reverseNumber();
        System.out.println("Reversed number: " + reversedNumber);
    }
}

class NumberReverser {
    private int number;

    public NumberReverser(int number) {
        this.number = number;
    }

    public int reverseNumber() {
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
