import java.util.Scanner;

public class MyArray {
    public static int maxEven(int[] a) {
        int maxEven = Integer.MIN_VALUE;
        for (int num : a) {
            if (num % 2 == 0 && num > maxEven) {
                maxEven = num;
            }
        }
        return maxEven;
    }

    public static int minOdd(int[] a) {
        int minOdd = Integer.MAX_VALUE;
        for (int num : a) {
            if (num % 2 != 0 && num < minOdd) {
                minOdd = num;
            }
        }
        return minOdd;
    }

    public static int sumMEMO(int[] a) {
        int maxEven = maxEven(a);
        int minOdd = minOdd(a);
        return maxEven + minOdd;
    }

    public static int sumEven(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int prodOdd(int[] a) {
        int product = 1;
        for (int num : a) {
            if (num % 2 != 0) {
                product *= num;
            }
        }
        return product;
    }

    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1; // If no even number is found
    }

    public static int idxLastOdd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1; // If no odd number is found
    }

    public static int[] input(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = input(n);
        System.out.println("Maximum Even: " + maxEven(arr));
        System.out.println("Minimum Odd: " + minOdd(arr));
        System.out.println("Sum of Max Even and Min Odd: " + sumMEMO(arr));
        System.out.println("Sum of Even Numbers: " + sumEven(arr));
        System.out.println("Product of Odd Numbers: " + prodOdd(arr));
        System.out.println("Index of First Even: " + idxFirstEven(arr));
        System.out.println("Index of Last Odd: " + idxLastOdd(arr));
    }
}
