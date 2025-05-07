import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

    private static HashMap<String, Word> dictionary = new HashMap<>();

    public static void main(String[] args) {
        // Sample dictionary entries
        dictionary.put("Hello", new Word("Hello", "Xin chào"));
        dictionary.put("Goodbye", new Word("Goodbye", "Tạm biệt"));
        dictionary.put("Thank you", new Word("Thank you", "Cảm ơn"));
        dictionary.put("Mother", new Word("Mother", "Mẹ"));
        dictionary.put("Father", new Word("Father", "Ba"));
        dictionary.put("Sister", new Word("Sister", "Chị"));
        dictionary.put("Brother", new Word("Brother", "Anh"));
        dictionary.put("House", new Word("House", "Nhà"));
        dictionary.put("Red", new Word("Red", "Đỏ"));
        dictionary.put("Blue", new Word("Blue", "Xanh"));

        Scanner scanner = new Scanner(System.in);
        String word;

        do {
            System.out.println("Enter a word to look up(or 'exit'): ");
            word = scanner.nextLine().trim();

            if (!word.equalsIgnoreCase("exit")) {
                String meaning = findMeaning(word);
                if (meaning != null) {
                    System.out.println(word + ": " + meaning);
                } else {
                    System.out.println("Word not found in the dictionary.");
                }
            }
        } while (!word.equalsIgnoreCase("exit"));

        scanner.close();
    }

    public static boolean isWordExist(String word) {
        return dictionary.containsKey(word);
    }

    public static String findMeaning(String word) {
        if (isWordExist(word)) {
            return dictionary.get(word).getMeaning();
        } else {
            return null;
        }
    }

    private static class Word {
        private String word;
        private String meaning;

        public Word(String word, String meaning) {
            this.word = word;
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
