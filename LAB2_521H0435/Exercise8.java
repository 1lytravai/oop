import java.math.BigDecimal;

public class Exercise8 {
    public static void main(String[] args) {
        BigDecimal[] arr = {new BigDecimal("10.5"), new BigDecimal("20.7"), new BigDecimal("15.3"), new BigDecimal("5.8")};
        BigDecimal max = findMax(arr);
        System.out.println("Maximum value in the array: " + max);
    }

    public static BigDecimal findMax(BigDecimal[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
        }

        BigDecimal max = arr[0]; // Initialize max with the first element of the array

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) { // Use compareTo() for comparison
                max = arr[i];
            }
        }

        return max;
    }
}
