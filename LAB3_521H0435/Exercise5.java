import java.util.*;

public class Exercise5 {

    public static void main(String[] args) {
        String paragraph = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";

        String[] words = paragraph.split("\\s+|(?=[,.!?])|(?<=[,.!?])");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        Map<String, Integer> wordFreqMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty() && !word.matches("[,.!?]")) {
                if (wordFreqMap.containsKey(word)) {
                    wordFreqMap.put(word, wordFreqMap.get(word) + 1);
                } else {
                    wordFreqMap.put(word, 1);
                }
            }
        }

        String[][] wordFreqArray = new String[wordFreqMap.size()][2];
        int index = 0;
        for (Map.Entry<String, Integer> entry : wordFreqMap.entrySet()) {
            wordFreqArray[index][0] = entry.getKey();
            wordFreqArray[index][1] = String.valueOf(entry.getValue());
            index++;
        }

        System.out.println("Word\tFrequency");
        for (String[] row : wordFreqArray) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
