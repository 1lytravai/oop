public class Exercise5 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5, 6, 7, 11, 12, 13};
            Prime analyzer = new Prime();
            System.out.println("Number of prime numbers in the array: " + analyzer.countPrimes(arr));
        }
    }

    class Prime {
        public int countPrimes(int arr[]) {
            int count = 0;
            for (int num : arr) {
                if (isPrime(num)) {
                    count++;
                }
            }
            return count;
        }
    
        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    