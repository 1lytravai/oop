public class Exercise2 {
    
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    
    // Function to multiply a matrix with a number
    public static int[][] multiplyMatrixWithNumber(int[][] matrix, int number) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * number;
            }
        }
        return result;
    }
    
    // Function to print a matrix to screen in matrix format
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        
        // Adding matrices
        System.out.println("Result of matrix addition:");
        int[][] sum = addMatrices(matrix1, matrix2);
        printMatrix(sum);
        
        // Multiplying matrix with a number
        System.out.println("\nResult of multiplying matrix with number:");
        int[][] multipliedMatrix = multiplyMatrixWithNumber(matrix1, 2);
        printMatrix(multipliedMatrix);
    }
}
