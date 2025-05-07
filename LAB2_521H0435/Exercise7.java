public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayManipulator manipulator = new ArrayManipulator();
        manipulator.square(arr);
        System.out.print("Squared array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class ArrayManipulator {
    public void square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i]; 
        }
    }
}
