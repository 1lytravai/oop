
public class Exercise3 {
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 22};
        System.out.println("Sum = " + sumArray(arr));
    }
    public static int sumArray(int arr[]) {
        int sum = 0; 
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
