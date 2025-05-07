public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 7};
        ThirdLargestFinder finder = new ThirdLargestFinder();
        int thirdLargest = finder.findThirdLargest(arr);
        System.out.println("The third largest element in the array: " + thirdLargest);
    }
}

class ThirdLargestFinder {
    public int findThirdLargest(int[] arr) {
        if (arr == null || arr.length < 3) {
            System.out.println("Array should have at least 3 elements");
        }

        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : arr) {
            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax;
    }
}
