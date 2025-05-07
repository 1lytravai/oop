public class Exercise2 {

    public static void main(String[] args) {
        int[] arr = {-1, 20, 30, 100, 50};
        System.out.println("Minumum value in the array: " + findMin(arr));
    }

    public static int findMin(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
        }
        
        int min = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { 
                min = arr[i];
            }
        }
        
        return min; 
    }
}    