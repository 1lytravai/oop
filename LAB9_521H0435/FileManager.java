import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private String folderPath;

    public FileManager(String folderPath) {
        this.folderPath = folderPath;
    }

    public List<File> getFilesByExtension(String extension) {
        File folder = new File(folderPath);
        List<File> fileList = new ArrayList<>();

        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(extension)) {
                    fileList.add(file);
                }
            }
        }
        return fileList;
    }

    public boolean checkIfFileOrDirectoryExists(String pathname) {
        File file = new File(pathname);
        return file.exists();
    }

    public boolean isDirectory(String pathname) {
        File file = new File(pathname);
        return file.isDirectory();
    }

    public void appendTextToFile(String filename, String text) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(text);
            writer.close();
            System.out.println("Text appended to file successfully.");
        } catch (IOException e) {
            System.out.println("Error appending text to file");
        }
    }

    public String findLongestWordInFile(String filename) {
        String longestWord = "";
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = bfReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            bfReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        return longestWord;
    }

    public static void main(String[] args) {
        FileManager fileManager = new FileManager("test");

        // Get files by extension
        List<File> txtFiles = fileManager.getFilesByExtension(".txt");
        System.out.println("Text files in folder:");
        for (File file : txtFiles) {
            System.out.println(file.getName());
        }

        // Check file or directory exists
        String pathname1 = "test/output2.txt";
        String pathname2 = "test";
        String pathname3 = "OOP";

        System.out.println("File or directory exists: " + fileManager.checkIfFileOrDirectoryExists(pathname1));
        System.out.println("File or directory exists: " + fileManager.checkIfFileOrDirectoryExists(pathname3));

        // Check if pathname is a directory or a file
        System.out.println("Is directory: " + fileManager.isDirectory(pathname1));
        System.out.println("Is directory: " + fileManager.isDirectory(pathname2));

        // Append text to file
        String filename = "test/test.txt";
        String textToAppend = "Hello, this is my university. ";
        fileManager.appendTextToFile(filename, textToAppend);

        // Find longest word in file
        String longestWord = fileManager.findLongestWordInFile(filename);
        System.out.println("Longest word in file: " + longestWord);
    }
}
