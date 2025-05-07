import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UppercaseFileConverter {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Read the input.txt
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        String uppercaseContent = content.toString().toUpperCase();

        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(uppercaseContent);
        }

        System.out.println("File conversion completed successfully!");

    }
}
