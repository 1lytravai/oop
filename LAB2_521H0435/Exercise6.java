public class Exercise6 {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int k = 0;
            ArrayFinder finder = new ArrayFinder();
            int index = finder.find(arr, k);
            if (index != -1) {
                System.out.println("Element " + k + " found at index: " + index);
            } else {
                System.out.println("Element " + k + " not found in the array.");
            }
        }
    }
    
    class ArrayFinder {
        public int find(int arr[], int k) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k) {
                    return i; 
                }
            }
            return -1;
        }
    
}
