import java.util.Scanner;

public class MyString1 {
    public static String shortName(String str) {
        String[] names = str.split(" ");
        if (names.length >= 2) {
            return names[names.length - 1] + " " + names[0];
        }
        return str;
    }
    public static String hashtagName(String str) {
        String[] names = str.split(" ");
        if (names.length >= 2) {
            return "#" + names[names.length - 1] + names[0];
        }
        return str;
    }

    public static String upperCaseAllVowel(String str) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (char vowel : vowels) {
            str = str.replace(vowel, Character.toUpperCase(vowel));
        }
        return str;
    }

    public static String upperCaseAllN(String str) {
        return str.replaceAll("n", "N");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a full name: ");
        String fullName = scanner.nextLine();

        // Test 
        System.out.println("Short Name: " + shortName(fullName));
        System.out.println("Hashtag Name: " + hashtagName(fullName));
        System.out.println("Uppercase All Vowels: " + upperCaseAllVowel(fullName));
        System.out.println("Uppercase All N's: " + upperCaseAllN(fullName));
    }
}
