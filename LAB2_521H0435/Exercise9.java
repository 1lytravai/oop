public class Exercise9 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int k = 2;
            int[] divisibleArr = divisibleNumbers(arr, k);
            System.out.print("Elements divisible by " + k + ": ");
            for (int num : divisibleArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    
        public static int[] divisibleNumbers(int arr[], int k) {
            int count = 0;
    
            for (int num : arr) {
                if (num % k == 0) {
                    count++;
                }
            }
    
            int[] divisibleArr = new int[count];
            int index = 0;
    
            for (int num : arr) {
                if (num % k == 0) {
                    divisibleArr[index] = num;
                    index++;
                }
            }
    
            return divisibleArr;
        }
    }

