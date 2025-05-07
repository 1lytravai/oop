public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 5, 4, 5, 5};
        int targetElement = 5;
        int occurrences = countOccurrences(array, targetElement);
        System.out.println("Occurrences of " + targetElement + " in the array: " + occurrences);
    }
    
    public static int countOccurrences(int[] array, int targetElement) {
        int count = 0;
        for (int element : array) {
            if (element == targetElement) {
                count++;
            }
        }
        return count;
    }


}
