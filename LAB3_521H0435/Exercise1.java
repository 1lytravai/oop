public class Exercise1  {

    //remove
    // public static boolean removeElement(int[] arr, int element) {
    //     int index = -1;
        
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == element) {
    //             index = i;
    //             break;
    //         }
    //     }
    //     if (index == -1)
    //         return false;
    //     else {
    //         for (int i = index - 1; i < arr.length - 1; i++) {
    //             arr[i] = arr[i + 1];
    //         }
    //         arr[index + 1] = 0;
    //         return true;
    //     }
    // }

    public static int[] removeElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
             return arr;
        }
        int[] anotherArray = new int[arr.length - 1]; 
  
        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, j = 0; i < arr.length; i++) { 
            if (i == index) { 
                continue; 
            } 
            anotherArray[j++] = arr[i]; 
        } 
        return anotherArray; 
    } 
    
    //insert one element
    public static void insertElement(int[] arr, int element, int position) {
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = element;
    }

    //find duplicate
    public static int[] findDuplicates(int[] arr) {
        boolean[] seen = new boolean[arr.length];
        int duplicatesCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !seen[j]) {
                    seen[j] = true;
                    duplicatesCount++;
                }
            }
        }
        int[] duplicates = new int[duplicatesCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (seen[i]) {
                duplicates[index++] = arr[i];
            }
        }
        return duplicates;
    }
    
    
    //remove duplicate
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 3};
        System.out.println("Original array:");
        printArray(arr1);
        
        //remove element
        System.out.println("Removing element 4:");
        int[] arr = removeElement(arr1, 2);
        printArray(arr);

        // insert element
        System.out.println("Inserting element 5 at position 2:");
        insertElement(arr1, 5, 2);
        printArray(arr1);

        //write duplicates
        int[] arr2 = {1, 3, 1, 3, 2, 4};
        System.out.println("Finding duplicates in array:");
        printArray(arr2);
        int[] duplicates = findDuplicates(arr2);
        System.out.println("Duplicate elements:");
        printArray(duplicates);
        
        //remove duplicates
        System.out.println("Removing duplicates from array:");
        int[] arr3 = {1, 3, 1, 3, 2, 4};
        printArray(arr3);
        int[] uniqueArr = removeDuplicates(arr3);
        System.out.println("Array with duplicates removed:");
        printArray(uniqueArr);
    }
}
