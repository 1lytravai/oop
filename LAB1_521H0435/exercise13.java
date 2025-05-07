public class exercise13 {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker(12321);
        System.out.println(palindromeChecker.getNumber() + " is a palindrome: " + palindromeChecker.isPalindrome());
    }
}

class PalindromeChecker {
    private int number;

    public PalindromeChecker(int number) {
        this.number = number;
    }

    public boolean isPalindrome() {
        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        return number == reversedNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
