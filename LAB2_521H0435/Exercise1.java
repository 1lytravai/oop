public class Exercise1 {

        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 100, 50};
            System.out.println("Maximum value in the array: " + findMax(arr));
        }
    
        public static int findMax(int arr[]) {
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty or null");
            }
            
            int max = arr[0]; 
            
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) { 
                    max = arr[i];
                }
            }
            
            return max; 
        }
    }    