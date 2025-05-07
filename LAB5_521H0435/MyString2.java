public class MyString2 {
    public static int countWords(String paragraph) {
        String[] words = paragraph.split("\\s+");
        return words.length;
    }

    public static int countSentences(String paragraph) {
        String[] sentences = paragraph.split("[.!?]");
        return sentences.length;
    }

    public static int countAppear(String paragraph, String word) {
        int count = 0;
        String[] words = paragraph.split("\\s+");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        String wordToCount = "the"; 

        // Test the methods
        System.out.println("Number of words: " + countWords(paragraph));
        System.out.println("Number of sentences: " + countSentences(paragraph));
        System.out.println("Number of appearances of '" + wordToCount + "': " + countAppear(paragraph, wordToCount));
    }
}
