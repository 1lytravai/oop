public class exercise10 {
    public static void main(String[] args) {
        DigitSum digitSum = new DigitSum(12345);
        int sum = digitSum.sumFirstAndLastDigits();
        System.out.println("Sum of the first and last digits: " + sum);
    }
}

class DigitSum {
    private int number;

    public DigitSum(int number) {
        this.number = number;
    }

    public int sumFirstAndLastDigits() {
        String numString = String.valueOf(number);
        
        char firstDigit = numString.charAt(0);
        char lastDigit = numString.charAt(numString.length() - 1);
        
        int sum = Character.getNumericValue(firstDigit) + Character.getNumericValue(lastDigit);
        
        return sum;
    }
}
