public class Exercise4 {

    // Function to find the length of the string
    public static int findLength(String str) {
        return str.length();
    }

    // Function to count the number of words in the string
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // Function to concatenate one string's contents to another
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    // Function to check if a string is a palindrome or not
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "level";
        String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("Length of the string: " + findLength(str));
        System.out.println("Number of words in the string: " + countWords(str));
        System.out.println("Concatenated strings: " + concatenateStrings(str1, str2));
        System.out.println("Is the string a palindrome? " + isPalindrome(str));
    }
}
